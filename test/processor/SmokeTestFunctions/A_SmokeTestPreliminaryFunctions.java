package processor.SmokeTestFunctions;

import jxl.Sheet;
import jxl.Workbook;
import or.OR;
import processor.CommonSeleniumActions;

import java.io.File;

public class A_SmokeTestPreliminaryFunctions extends CommonSeleniumActions implements OR {

    public static synchronized Integer getRowsOfExcel(String xlFilePath, String sheetName) throws Exception{
        Integer numberOfRows = 0;
        Workbook workbook = null;
        try {
            workbook = Workbook.getWorkbook(new File(xlFilePath));
            Sheet sheet = workbook.getSheet(sheetName);
            numberOfRows = sheet.getRows();
        }
        finally {
            workbook.close();
        }
        return(numberOfRows);
    }

    //function to read input excel sheet
    public static synchronized String[][] readAllRowsOfExcel(String xlFilePath, String sheetName) throws Exception{
        String[][] valuesArray=null;
        Workbook workbook = null;
        try {
            workbook = Workbook.getWorkbook(new File(xlFilePath));
            Sheet sheet = workbook.getSheet(sheetName);
            int numberOfRows = sheet.getRows();
            int numberOfColumns = sheet.getColumns();
            valuesArray=new String[numberOfRows-1][numberOfColumns];
            int rowCounter=0;

            for (int i=1;i<numberOfRows;i++,rowCounter++){
                int ColumnCounter=0;
                for (int j=0;j<numberOfColumns;j++,ColumnCounter++){
                    valuesArray[rowCounter][ColumnCounter]=sheet.getCell(j,i).getContents();
                    //System.out.println(valuesArray[rowCounter][ColumnCounter]);
                }
            }
        }
        finally {
            workbook.close();
        }
        // }

        return(valuesArray);
    }
}

