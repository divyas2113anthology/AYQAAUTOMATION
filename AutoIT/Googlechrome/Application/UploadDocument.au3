WinWait("Open")
WinActivate("Open")
ControlSetText("Open", "", "[CLASS:Edit;INSTANCE:1]", "C:\AY\AY_Source_File\Application\ImportForSmokeTest.doc")
;ControlSetText("Open", "", "[CLASS:Edit;INSTANCE:1]", "T:\EMT\Quality Assurance\Selenium Scripts\AY\AY\AY_Source_File\Application\ImportForSmokeTest.doc")
ControlClick("Open", "", "[CLASS:Button;TEXT:&Open]")	

