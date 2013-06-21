If WinExists("File Download") Then
WinActivate("File Download")
ControlClick("File Download", "", "[oCLASS:Button;TEXT:Cancel]")
;Sleep(1000)
EndIf
If WinExists("[REGEXPTITLE:pdf]") Then
WinActivate("[REGEXPTITLE:pdf]")
WinClose("[REGEXPTITLE:pdf]")
;Sleep(1000)
EndIf
If WinExists("System Messages") Then
	WinActivate("System Messages")
	WinClose("System Messages")
EndIf	
If WinExists("Google") Then
	WinActivate("Google")
	WinClose("Google")
EndIf	
