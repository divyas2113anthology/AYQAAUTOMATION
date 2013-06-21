WinWait("Opening")
WinActivate("Opening")
;$filename = ControlGetText("File Download","","[CLASS:SysLink]")
;ControlClick("File Download", "", "[CLASS:Button;TEXT:&Save]")
Send("{DOWN}")
Send("{ENTER}")
WinWait("Enter name of file to save")
WinActivate("Enter name of file to save")
$filename = ControlGetText("Enter name of file to save", "", "[CLASS:Edit;INSTANCE:1]")
;ControlSetText("Enter name of file to save", "", "[CLASS:Edit;INSTANCE:1]", $CmdLine[1]&"\"&$filename)
$location = $CmdLine[1]&"\"&$filename
Send($location)
;ControlSetText("Save As", "", "[CLASS:Edit;INSTANCE:1]", "T:\EMT\Quality Assurance\Selenium Scripts\AY\AY\AYAutoIt\WebCenter\SavedFile.pdf")
ControlClick("Enter name of file to save", "", "[CLASS:Button;TEXT:&Save]")
If (WinExists("Enter name of file to save")) Then
ControlClick("Enter name of file to save", "", "[CLASS:Button;TEXT:&Yes]")
EndIf