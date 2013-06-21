WinWait("Windows Internet Explorer","The webpage you are viewing is trying to close the window.")
WinActivate("Windows Internet Explorer","The webpage you are viewing is trying to close the window.")
ControlClick("Windows Internet Explorer", "The webpage you are viewing is trying to close the window.", "[CLASS:Button;TEXT:&Yes]")