WinWait("Opening")
WinActivate("Opening")
;$filename = ControlGetText("File Download","","[CLASS:SysLink]")
;ControlClick("File Download", "", "[CLASS:Button;TEXT:&Save]")
Send("{DOWN}")
Send("{ENTER}")
WinWait("Enter name of file to save")
WinActivate("Enter name of file to save")
ControlSetText("Enter name of file to save", "", "[CLASS:Edit;INSTANCE:1]", "C:\AY\AY_Source_File\Application\DownloadForm\Uploadform.txt")
;ControlSetText("Save As", "", "[CLASS:Edit;INSTANCE:1]", "T:\EMT\Quality Assurance\Selenium Scripts\AY\AY\AYAutoIt\WebCenter\SavedFile.pdf")
ControlClick("Enter name of file to save", "", "[CLASS:Button;TEXT:&Save]")
If (WinExists("Enter name of file to save")) Then
ControlClick("Enter name of file to save", "", "[CLASS:Button;TEXT:&Yes]")
EndIf
