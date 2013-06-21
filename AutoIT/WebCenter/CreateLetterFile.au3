WinWait("File Download - Security Warning")
WinActivate("File Download - Security Warning")
$filename = ControlGetText("File Download - Security Warning","","[CLASS:SysLink]")
ControlClick("File Download - Security Warning", "", "[CLASS:Button;TEXT:&Save]")
WinWait("Save As")
WinActivate("Save As")
;ControlSetText("Save As", "", "[CLASS:Edit;INSTANCE:1]", "C:\AY\AY_Source_File\Application\"&$filename)
ControlSetText("Save As", "", "[CLASS:Edit;INSTANCE:1]", "C:\AY\AY_Source_File\Webcenter\SaveLetter\CreatedLetter.doc")
ControlClick("Save As", "", "[CLASS:Button;TEXT:&Save]")
If WinExists("Confirm Save As") Then
	WinActivate("Confirm Save As")
	ControlClick("Confirm Save As", "", "[CLASS:Button;TEXT:&Yes]")
	ElseIf WinExists("Save As") Then
		WinActivate("Save As")
	ControlClick("Save As", "", "[CLASS:Button;TEXT:&Yes]")
		EndIf
