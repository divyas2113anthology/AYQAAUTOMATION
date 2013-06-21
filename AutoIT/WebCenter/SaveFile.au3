WinWait("File Download")
WinActivate("File Download")
$ggg = ControlGetText("File Download","","[CLASS:SysLink]")
ControlClick("File Download", "", "[CLASS:Button;TEXT:&Save]")
WinWait("Save As")
WinActivate("Save As")
ControlSetText("Save As", "", "[CLASS:Edit;INSTANCE:1]", "C:\AY\AY_Source_File\Webcenter\SaveFiles\"&$ggg)
ControlClick("Save As", "", "[CLASS:Button;TEXT:&Save]")
if WinActivate("Save As") Then
ControlClick("Save As", "", "[CLASS:Button;TEXT:&Yes]")
EndIf
	