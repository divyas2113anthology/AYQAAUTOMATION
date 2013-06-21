WinWait("Choose")
WinActivate("Choose")
ControlSetText("Choose", "", "[CLASS:Edit;INSTANCE:1]", $CmdLine[1])
ControlClick("Choose", "", "[CLASS:Button;TEXT:&Open]")	