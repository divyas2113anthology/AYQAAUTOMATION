WinWait("Choose")
WinActivate("Choose")
ControlSetText("Choose", "", "[CLASS:Edit;INSTANCE:1]", "C:\AY\AY_Source_File\Application\ImportForSmokeTest.doc")
;ControlSetText("Choose", "", "[CLASS:Edit;INSTANCE:1]", "T:\EMT\Quality Assurance\Selenium Scripts\AY\AY\AY_Source_File\Application\ImportForSmokeTest.doc")
ControlClick("Choose", "", "[CLASS:Button;TEXT:&Open]")	

