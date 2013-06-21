WinWait("File Download - Security Warning")
WinActivate("File Download - Security Warning")
ControlClick("File Download - Security Warning", "", "[CLASS:Button;TEXT:&Save]")
WinWait("Save As")
WinActivate("Save As")
ControlSetText("Save As", "", "[CLASS:Edit;INSTANCE:1]", "C:\AY\AY_Source_File\Webcenter\SaveCreate\ApplicantCreateLable.pdf")
;ControlSetText("Save As", "", "[CLASS:Edit;INSTANCE:1]", "T:\EMT\Quality Assurance\Selenium Scripts\AY\AY\AYAutoIt\Webcenter\SaveCreate\ApplicantCreateLable.pdf")
ControlClick("Save As", "", "[CLASS:Button;TEXT:&Save]")
If WinExists("Confirm Save As") Then
	WinActivate("Confirm Save As")
	ControlClick("Confirm Save As", "", "[CLASS:Button;TEXT:&Yes]")
	ElseIf WinExists("Save As") Then
		WinActivate("Save As")
	ControlClick("Save As", "", "[CLASS:Button;TEXT:&Yes]")
		EndIf
