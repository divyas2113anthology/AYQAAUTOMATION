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
ControlFocus("sftp://ayqatest@ftp.hobsons.com - FileZilla", "", "[CLASS:Edit; INSTANCE:6]")
ControlSend("sftp://ayqatest@ftp.hobsons.com - FileZilla", "", "[CLASS:Edit; INSTANCE:6]","temp")
Send("{Enter}")
Sleep(10000)
ControlFocus("sftp://ayqatest@ftp.hobsons.com - FileZilla", "", "[CLASS:SysListView32; INSTANCE:5]")

If FileExists("testexport.txt") Then 
	MsgBox(0, "", "File not imported to server")
	 
Else
MsgBox(1, "", "Successfully Exported to Server",5)
Sleep(5000)
WinClose("sftp://ayqatest@ftp.hobsons.com - FileZilla")
EndIf