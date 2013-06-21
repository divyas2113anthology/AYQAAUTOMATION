WinWait("File Download")
WinActivate("File Download")
$filename = ControlGetText("File Download","","[CLASS:SysLink]")
ControlClick("File Download", "", "[CLASS:Button;TEXT:&Save]")
WinWait("Save As")
WinActivate("Save As")
;ControlSetText("Save As", "", "[CLASS:Edit;INSTANCE:1]", "C:\AY\AY_Source_File\Application\DownloadForm\"&$filename)
ControlSetText("Save As", "", "[CLASS:Edit;INSTANCE:1]", "T:\WebProducts\QA\SeleniumScripts\AY\SourceFile\Application\DownloadDocument\"&$filename)
ControlClick("Save As", "", "[CLASS:Button;TEXT:&Save]")
If (WinExists("Save As")) Then
ControlClick("Save As", "", "[CLASS:Button;TEXT:&Yes]")
EndIf
