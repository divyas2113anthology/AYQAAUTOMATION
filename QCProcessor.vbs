'------------------------------------------------------------------------------------
GLDomain = Wscript.Arguments.Item(0)
GLProject = Wscript.Arguments.Item(1)
GLTestId = Wscript.Arguments.Item(2)
RunID = Wscript.Arguments.Item(3)
Dim tdc, qcServer
Dim objFSO, objFolder, objShell, objTextFile, objFile, oExec, oWait
Dim strDirectory, strFile, strLine, attachF ,emptyfile
'------------------------------------------------------------------------------------
'Connect to QC
'------------------------------------------------------------------------------------
'qcHostName = "iad1qu003:8080"
qcHostName = "10.56.148.122:8080"
qcUser = "automation"
qcPassword = "qatest"
qcDomain = GLDomain 
qcProject = GLProject
qcServer = "http://" & qcHostName & "/qcbin"
Set tdc = CreateObject("TDApiOle80.TDConnection")
tdc.InitConnectionEx qcServer
tdc.Login qcUser, qcPassword
tdc.Connect qcDomain, qcProject

'------------------------------------------------------------------------------------
'Get Test, filter by ID
'------------------------------------------------------------------------------------
    Set tFact = tdc.TestFactory
    Set TestFilter = tFact.Filter
    TestFilter.Filter("TS_TEST_ID") = GLTestID
    Set testList = tfact.NewList(TestFilter.Text)
    Set theTest = testList.Item(1)
    GLTestCaseName = theTest.Name 

'------------------------------------------------------------------------------------
'Create output file
'------------------------------------------------------------------------------------
'strDirectory = "\\Intranet\Teams\WebProducts\QA\Framework\csv\"
strDirectory = "\\Intranet\Teams\WebProducts\QA\SeleniumScripts\AY\csv\"
strFile1 = GLTestId &"_"&GLTestCaseName
strFile = GLTestId &"_"&GLTestCaseName&".csv"
' Create the File System Object
 Set objFSO = CreateObject("Scripting.FileSystemObject")
 
 ' Check that the strDirectory folder exists
 If objFSO.FolderExists(strDirectory) Then
    Set objFolder = objFSO.GetFolder(strDirectory)
 Else
    Set objFolder = objFSO.CreateFolder(strDirectory)
 End If
 
 Set objFile = objFSO.CreateTextFile(strDirectory & strFile,True) 
 set objFile = nothing
 set objFolder = nothing
' OpenTextFile Method needs a Const value
' ForAppending = 8 ForReading = 1, ForWriting = 2
 Const ForWriting = 2
 Const ForAppending = 8
 
 Set objTextFile = objFSO.OpenTextFile _
 (strDirectory & strFile, ForWriting, True)
'------------------------------------------------------------------------------------
'Get Test Steps and Data & write to output file
'------------------------------------------------------------------------------------
Set oSteps = theTest.DesignStepFactory
Set allSteps = oSteps.NewList("")
numSteps = theTest.DesStepsNum
Dim stepArray()
Dim stepParams()
Redim stepArray(numSteps)
For ds =  1 to numSteps
 Set oStep=allSteps(ds)
 If oStep.Field("DS_LINK_TEST") <> "" Then
 GLProcedureID = oStep.Field("DS_LINK_TEST")

'Retrieve the Linked Procedure Name
    Set tFact2 = tdc.TestFactory
    Set TestFilter2 = tFact2.Filter
    TestFilter2.Filter("TS_TEST_ID") = GLProcedureID
    Set testList2 = tfact2.NewList(TestFilter2.Text)
    Set theTest2 = testList2.Item(1)
    GLProcedureName = theTest2.Name 
  stepArray(ds)=GLProcedureName
 
  set linkedParams = ostep.linkedparams
  If linkedParams.Count > 0 Then
   ReDim stepParams(linkedParams.Count-1,1)
  End If
  For i = 0 to linkedParams.Count - 1
   stepArray(ds)=steparray(ds)&","&linkedParams.ParamName(i)
   stepArray(ds)=steparray(ds)&","&linkedParams.ParamValue(i)
  Next
  objTextFile.WriteLine(stepArray(ds))
 End If
Next
objTextFile.close
'------------------------------------------------------------------------------------
'Run Selenium Processor and wait until test execution is complete
'------------------------------------------------------------------------------------
Set WSHShell = CreateObject("WScript.Shell")
'WSHShell.Exec("\\intranet\teams\WebProducts\QA\Framework\Processor.bat")
'Wscript.Sleep 1000
command = "cmd /C java -classpath \\Intranet\Teams\WebProducts\QA\SeleniumScripts\AY\bin;C:\Selenium\*; org.testng.TestNG \\Intranet\Teams\WebProducts\QA\SeleniumScripts\AY\Suite\DriverSuite.xml -d \\Intranet\Teams\WebProducts\QA\SeleniumScripts\AY\Results\"&strFile1

'msgbox command

'Set oExec = WSHShell.Exec(command)
'WSHShell.run "cmd /K CD T:\WebProducts\QA\AutomationFramework"
'WSHShell.run "java -classpath bin;C:/Selenium/*; org.testng.TestNG Suite/DriverSuite.xml -d Results/"&strFile1

oExec = WSHShell.Run(command,1,true)
    'Do While oExec.Status = 0	'wait till process ends
     'Wscript.Sleep 100
	'Loop
'msgbox "completed java call"
'------------------------------------------------------------------------------------
'------------------------------------------------------------------------------------
'Update Run Status & attach Run Report
'------------------------------------------------------------------------------------
'Msgbox "Update CSV FILE"
'Open csv file to read RUN_STATUS and RUN_REPORT path
'strDirectory = "\\Intranet\Teams\WebProducts\QA\Framework\csv\"
strDirectory = "\\Intranet\Teams\WebProducts\QA\SeleniumScripts\AY\csv\"
strFile = GLTestId &"_"&GLTestCaseName&".csv"
'strFile = "old_1946_FrameworkTest.csv"
'Msgbox "Opening csv file to read results: " & strDirectory & strFile
Set objFSO = CreateObject("Scripting.FileSystemObject")
Const ForReading = 1
Set objTextFile = objFSO.OpenTextFile(strDirectory & strFile, ForReading, True)
Do While objTextFile.AtEndOfStream = False
    strLine = objTextFile.ReadLine
    If Instr(strLine, "RUN_STATUS,") > 0 Then
    strStatus=Mid(strLine, Instr(strLine, ",")+1, Len(strLine))
'msgbox strStatus
    End If

    If Instr(strLine, "RUN_REPORT,") > 0 Then
    strReport=Mid(strLine, Instr(strLine, ",")+1, Len(strLine))
'msgbox strReport
    End If

Loop

'Update Run Result
    Set RunF = tdc.RunFactory
    Set aFilter = RunF.Filter
    aFilter.Filter("RN_RUN_ID") = RunID
    Set lst = RunF.NewList(aFilter.Text)
    Set theRun = lst.Item(1)

    Set runStepF = theRun.StepFactory
    Set runStep2 = runStepF.AddItem("Run Status")
'msgbox ("strStatus = '" & strStatus & "'")
If strStatus = "" then
	 runStep2.Status = "Failed"
ElseIf lcase(strStatus) = "failed" then
     runStep2.Status = "Failed"
ElseIf lcase(strStatus) = "passed" then
     runStep2.Status = "Passed"
End If
     runStep2.Post

If strStatus = "" then
	theRun.Status = "FAILED"
ElseIF lcase(strStatus) = "failed" then
    theRun.Status = "FAILED"
ElseIf lcase(strStatus) = "passed" then
   theRun.Status = "PASSED"
End If
    theRun.Post


'Upload Run Report as attachment
'Msgbox "Uploading results from: " & strReport
If strReport <> "" then
   set attachF = theRun.Attachments
   Set theAttachment = attachF.AddItem(null)
   theAttachment.FileName = strReport
   theAttachment.Type = 1
   theAttachment.Post
 End IF  
'------------------------------------------------------------------------------------
'Disconnect from QC
'------------------------------------------------------------------------------------
tdc.Disconnect
tdc.Logout
tdc.ReleaseConnection
objTextFile.Close

'------------------------------------------------------------------------------------






