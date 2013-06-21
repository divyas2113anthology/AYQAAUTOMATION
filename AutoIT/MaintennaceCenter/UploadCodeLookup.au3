WinWait("Choose")
WinActivate("Choose")
$time = @MSEC
;MsgBox(4096, "Millsec", $time)
$filename = "Codelookup"&$time&".xls"
;MsgBox(4096, "Filename", $filename)
;FileMove("C:\AY\AY_Source_File\MaintennaceCenter\UploadCodeLookup\Source\SmallTest.xls","C:\AY\AY_Source_File\MaintennaceCenter\UploadCodeLookup\Destination\"$filename,0)
FileCopy("C:\AY\AY_Source_File\MaintennaceCenter\UploadCodeLookup\Source\SmallTest.xls","C:\AY\AY_Source_File\MaintennaceCenter\UploadCodeLookup\Destination\"&$filename)
ControlSetText("Choose", "", "[CLASS:Edit;INSTANCE:1]", "C:\AY\AY_Source_File\MaintennaceCenter\UploadCodeLookup\Destination\"&$filename)
;ControlSetText("Choose", "", "[CLASS:Edit;INSTANCE:1]", "T:\EMT\Quality Assurance\Selenium Scripts\AY\AY\AY_Source_File\Application\ImportForSmokeTest.doc")
ControlClick("Choose", "", "[CLASS:Button;TEXT:&Open]")	