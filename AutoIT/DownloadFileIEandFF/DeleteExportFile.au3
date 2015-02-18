Local $sFilePath =  "C:\Users\emtqaaccount\Downloads\ExportClientUsers.xls"
Local $iFileExists = FileExists($sFilePath)
    ; Display a message of whether the file exists or not.
    If $iFileExists Then
        FileDelete($sFilePath)

    EndIf
    ; Delete the temporary file.
