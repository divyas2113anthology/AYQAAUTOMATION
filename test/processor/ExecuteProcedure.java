package processor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.Assert;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import static processor.Processor.selenium;

public class ExecuteProcedure implements IMethodInterceptor {
	public static List<IMethodInstance>  methodReposit;
//	public static List<IMethodInstance>  allmethods;
//	public static List<IMethodInstance>  methodReposit1;
	public static int procdurecounter = 1; 
	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods,	ITestContext context) {
//		System.out.println("======Repeat Heading=============");
		
		if (procdurecounter > 2 ) {
//			System.out.println("======Repeat Heading=============");
//			methodReposit1 = new ArrayList<IMethodInstance>();
			return new ArrayList<IMethodInstance>();
		}
		
		if (procdurecounter == 1) {
//			System.out.println("====== 1 Repeat Heading=============");
//			allmethods = methods;
//			
//			procdurecounter++;
//		}

		
//		List<IMethodInstance>  methodReposit = new ArrayList<IMethodInstance>();
		methodReposit = new ArrayList<IMethodInstance>();
		
//		if (procdurecounter == 1) {
//			System.out.println("Excecute procedure Loop");
//			procdurecounter++;
//		methodReposit = new ArrayList<IMethodInstance>();
//		System.out.println("======Repeat=============");
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
//			System.out.println("Excel File Location Name for Excel"+autoframework+"\\csv\\"+filename+".csv");
//			if (procdurecounter == 1) {
//				procdurecounter++;
			BufferedReader csvRead = new BufferedReader(new InputStreamReader(new FileInputStream(autoframework+"\\csv\\"+filename+".csv")));
			String line;			 
			String[] methodname = null;
//			while ((line = csvRead.readLine()) != null){
			while ((line = csvRead.readLine()) != null){
				methodname =  line.split(",",-1);				
//				System.out.println("Method Name From Excel: "+methodname[0]);
			String methodfound ="NotFound";
			
//			Iterator<IMethodInstance> it = methods.iterator();
//			   while(it.hasNext()) {
//			    	IMethodInstance iMethodInstance = it.next();
//			    	String name = iMethodInstance.getMethod().getMethodName();
//			    	System.out.println("Package Methods"+name);	
//		            if (name.equals(methodname[0])) {	            	
//	            	methodfound = "Found";
//	            	methodReposit.add(iMethodInstance);
//	            	break;
//				}
//			    }
			for (IMethodInstance method : methods) {
//			for (IMethodInstance method : allmethods) {
				String name = method.getMethod().getMethodName();
//				System.out.println("Package Methods"+name);				
	            if (name.equals(methodname[0])) {	            	
	            	methodfound = "Found";
	            	methodReposit.add(method);
	            	break;
				}			
			}
			
//			for (IMethodInstance method : methods) {
//				String name = method.getMethod().getMethodName();
//				System.out.println("All Package Methods : "+name);
//				}
//			System.out.println("===================");
			
//			if (procdurecounter == 1) {
//				System.out.println("Excecute procedure Loop");
//				procdurecounter++;
			
			if (methodfound.equals("NotFound")) {
			   selenium.close();
			   selenium.stop();
			   Assert.fail("["+methodname[0]+"] Procedure was Not Scripted");
			}
			
			
//			}

		
		}
//			csvRead.reset();
			csvRead.close();
			
			
			
			}catch(IOException e) {

		}
		}
//		else{

		
//			methodReposit1.clear();
//			for (int i = 0; i < methodReposit.size(); i++) {
//				methodReposit1.add(methodReposit.get(i));
//			}
			
//		}
		procdurecounter++;
		return methodReposit;
//			return methodReposit1;
	}

}
