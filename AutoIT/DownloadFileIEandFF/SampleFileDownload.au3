#include <file.au3>

AutoItSetOption("WinTitleMatchMode","2")

_Log("----new session----")
;Actiate firefox/IE browser
$title = WinGetTitle("Mozilla Firefox") ; retrives whole window title
_Log("FireFox selected")

$hResult = WinActivate($title);
If($hResult == 0) Then
_Log("Unable to find "&$title)
Else
_Log($title&" activated")
;WinWait($CmdLine[2]);
WinWait("Opening");


WinActivate("Opening");
;WinActivate($CmdLine[2]);
;_Log($CmdLine[2]&" :" )
_Log("File Download")

Send("{ENTER}")
Send("{ENTER}")
WinClose("[CLASS:Notepad]")
EndIf

;used for logging
Func _Log($sLogMsg)
_FileWriteLog(@ScriptDir & "\AutoItLog.log",$sLogMsg)
EndFunc
