#Region ;**** Directives created by AutoIt3Wrapper_GUI ****
#AutoIt3Wrapper_Compression=4
#EndRegion ;**** Directives created by AutoIt3Wrapper_GUI ****
WinWait("Opening")
WinActivate("Opening")
;$filename = ControlGetText("File Download","","[CLASS:SysLink]")
;ControlClick("File Download", "", "[CLASS:Button;TEXT:&Save]")
;Sleep(1000)
Send("{DOWN}")
Send("{ENTER}")
WinWait("Enter name of file to save")
WinActivate("Enter name of file to save")
Sleep(2000)
$filename = ControlGetText("Enter name of file to save", "", "[CLASS:Edit;INSTANCE:1]")
;ControlSetText("Enter name of file to save", "", "[CLASS:Edit;INSTANCE:1]", $CmdLine[1]&"\"&$filename)
$location = $CmdLine[1]&"\"&$filename
Send($location)
;ControlSetText("Save As", "", "[CLASS:Edit;INSTANCE:1]", "T:\EMT\Quality Assurance\Selenium Scripts\AY\AY\AYAutoIt\WebCenter\SavedFile.pdf")
Send("{ENTER}")
;ControlClick("Enter name of file to save", "", "[CLASS:Button;TEXT:&Save]")
;If (WinExists("Enter name of file to save")) Then
;ControlClick("Enter name of file to save", "", "[CLASS:Button;TEXT:&Yes]")
;EndIf