;#include <MsgBoxConstants.au3>
Run("C:\\Program Files (x86)\\FileZilla FTP Client\\filezilla.exe")
WinWaitActive("FileZilla")
ControlSend("FileZilla", "", "[CLASS:Edit; INSTANCE:1]","ftp.hobsons.com")
ControlSend("FileZilla", "", "[CLASS:Edit; INSTANCE:2]","ayqatest")
ControlSend("FileZilla", "", "[CLASS:Edit; INSTANCE:3]","4ayqatest{!}")
ControlSend("FileZilla", "", "[CLASS:Edit; INSTANCE:4]","22")
;MsgBox(64, "CONNECTION", "Hello, server connection established !")
ControlClick("FileZilla", "","[CLASS:Button]")
WinWaitActive("sftp://ayqatest@ftp.hobsons.com - FileZilla")
Sleep(10000)
Send("{ALT}{t}{m}")
WinWaitActive("Manual transfer")
ControlClick("Manual transfer", "", "[CLASS:Button; INSTANCE:3]")
ControlFocus("Manual transfer", "", "[CLASS:Edit; INSTANCE:1]")
Send("{DEL 4}")
ControlSend("Manual transfer","","[CLASS:Edit; INSTANCE:1]","C:\Selenium\pdfimport.zip")
ControlFocus("Manual transfer", "", "[CLASS:Edit; INSTANCE:2]")
Send("{DEL 2}")
ControlSend("Manual transfer", "","[CLASS:Edit; INSTANCE:2]","/temp")
ControlSend("Manual transfer", "","[CLASS:Edit; INSTANCE:3]","pdfimport.zip")
ControlClick("Manual transfer", "", "[CLASS:Button; INSTANCE:17]")
ControlClick("Manual transfer", "", "[CLASS:Button; INSTANCE:18]")
WinWaitActive("sftp://ayqatest@ftp.hobsons.com - FileZilla")
ControlFocus("sftp://ayqatest@ftp.hobsons.com - FileZilla", "", "[CLASS:Edit; INSTANCE:6]")
ControlSend("sftp://ayqatest@ftp.hobsons.com - FileZilla", "", "[CLASS:Edit; INSTANCE:6]","temp")
Send("{Enter}")

ControlFocus("sftp://ayqatest@ftp.hobsons.com - FileZilla", "", "[CLASS:SysListView32; INSTANCE:5]")
Sleep(10000)
If FileExists("pdfimport.zip") Then 
	WinClose("sftp://ayqatest@ftp.hobsons.com - FileZilla") 
Else
	MsgBox(1, "", "Its not exists")
EndIf



