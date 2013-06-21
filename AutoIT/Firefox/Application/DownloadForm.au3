WinWait("Opening")
WinActivate("Opening")
;$filename = ControlGetText("File Download","","[CLASS:SysLink]")
;ControlClick("File Download", "", "[CLASS:Button;TEXT:&Save]")
Send("{DOWN}")
Send("{ENTER}")
WinWait("[REGEXPTITLE:Enter name of file to save]")
;WinActivate("[REGEXPTITLE:save]")
;ControlSetText("Enter name of file to save", "", "[CLASS:Edit;INSTANCE:1]", "C:\AY\AY_Source_File\Application\DownloadForm\Uploadform.txt")
ControlSetText("[REGEXPTITLE:Enter name of file to save]", "", "[CLASS:Edit;INSTANCE:1]", "T:\WebProducts\QA\SeleniumScripts\AY\SourceFile\Application\DownloadDocument\uploadform")
ControlClick("[REGEXPTITLE:Enter name of file to save]", "", "[CLASS:Button;TEXT:&Save]")
If (WinExists("[REGEXPTITLE:Confirm Save As]")) Then
ControlClick("[REGEXPTITLE:Confirm Save As]", "", "[CLASS:Button;TEXT:&Yes]")
EndIf