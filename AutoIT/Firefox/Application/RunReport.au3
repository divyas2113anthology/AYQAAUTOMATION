WinWait("File Download")
WinActivate("File Download")
ControlClick("File Download", "", "[CLASS:Button;TEXT:&Save]")
WinWait("Save As")
WinActivate("Save As")
ControlSetText("Save As", "", "[CLASS:Edit;INSTANCE:1]", "C:\AY\AY_Source_File\Application\RunReport\Report.xls")
;ControlSetText("Save As", "", "[CLASS:Edit;INSTANCE:1]", "T:\EMT\Quality Assurance\Selenium Scripts\AY\AY\AYAutoIt\WebCenter\SavedFile.pdf")
ControlClick("Save As", "", "[CLASS:Button;TEXT:&Save]")
Sleep(2000)
If (WinExists("Save As")) Then
ControlClick("Save As", "", "[CLASS:Button;TEXT:&Yes]")
EndIf