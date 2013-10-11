package processor;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
 
public class GenerateCsv
{
   public static void main(String fileName, String csvData)
   {
	   //delete file from prior run
	   File file = new File(fileName);
	   file.delete();
	   generateCsvFile(fileName,csvData); 
   }
 
   private static void generateCsvFile(String sFileName,String csvData)
   {
	try
	{
		
		FileWriter writer = new FileWriter(sFileName);
	    writer.write(csvData);
	    writer.flush();
	    writer.close();
	}
	catch(IOException e)
	{
	     e.printStackTrace();
	} 
    }
}