WinWait("File Download")
WinActivate("File Download")
ControlClick("File Download", "", "[CLASS:Button;TEXT:&Save]")
WinWait("Save As")
WinActivate("Save As")
ControlSetText("Save As", "", "[CLASS:Edit;INSTANCE:1]", "C:\AY\AY_Source_File\Webcenter\BatchPrintApp\BatchPrintData.pdf")
;ControlSetText("Save As", "", "[CLASS:Edit;INSTANCE:1]", "T:\EMT\Quality Assurance\Selenium Scripts\AY\AY\AYAutoIt\WebCenter\SavedFile.pdf")
ControlClick("Save As", "", "[CLASS:Button;TEXT:&Save]")
if WinActivate("Save As") Then
ControlClick("Save As", "", "[CLASS:Button;TEXT:&Yes]")
EndIf
