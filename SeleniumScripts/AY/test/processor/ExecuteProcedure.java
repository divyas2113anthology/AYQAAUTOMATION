package processor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.Reporter;
import static processor.Processor.selenium;
import static processor.Processor.jettyProxy;
public class ExecuteProcedure implements IMethodInterceptor {
	public List<IMethodInstance>  intercept(List<IMethodInstance> methods, ITestContext context) {
		List<IMethodInstance>  methodReposit = new ArrayList<IMethodInstance>();		
		try {
			
			 String outputlocation =  context.getOutputDirectory();
			String[] outfilename = outputlocation.split("\\\\");
			String filename = outfilename[outfilename.length-2];	
//			String filename = "AccountCreation";			
			
//			System.out.println("Output directory"+filename);
//			BufferedReader csvRead = new BufferedReader(new InputStreamReader(new FileInputStream("csv/Application.csv")));
//			BufferedReader csvRead = new BufferedReader(new InputStreamReader(new FileInputStream("csv/"+filename+".csv")));
			String outlocadrive = outputlocation.substring(0,outputlocation.lastIndexOf("\\"));
			String outlocarepo = outputlocation.substring(0,outlocadrive.lastIndexOf("\\"));
			String autoframework = outputlocation.substring(0,outlocarepo.lastIndexOf("\\"));	
			BufferedReader csvRead = new BufferedReader(new InputStreamReader(new FileInputStream(autoframework+"\\csv\\"+filename+".csv")));
			String line;			 
			String[] methodname = null;
			while ((line = csvRead.readLine()) != null){	
				methodname =  line.split(",",-1);
			String methodfound ="NotFound";
			for (IMethodInstance method : methods) {
				String name = method.getMethod().getMethodName();
	            if (name.equals(methodname[0])) {
	            	methodfound = "Found";
	            	methodReposit.add(method);
	            	break;
				}			
			}
			
			if (methodfound.equals("NotFound")) {
			   selenium.close();
			   selenium.stop();
			   Assert.fail("["+methodname[0]+"] Procedure was Not Found");
			}

		
		}
		}catch(IOException e) {

		}
				return methodReposit;

		}
}
