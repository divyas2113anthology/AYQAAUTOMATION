WinWait("Choose")
WinActivate("Choose")
ControlSetText("Choose", "", "[CLASS:Edit;INSTANCE:1]", "C:\AY\AY_Source_File\Webcenter\RunImport\Import.txt")
;ControlSetText("Choose File to Upload", "", "[CLASS:Edit;INSTANCE:1]", "T:\EMT\Quality Assurance\Selenium Scripts\AY\AY\AY_Source_File\Webcenter\ImportFile\ImportForSmokeTest.txt")
ControlClick("Choose", "", "[CLASS:Button;TEXT:&Open]")