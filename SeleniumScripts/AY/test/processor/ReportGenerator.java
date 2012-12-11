package processor;


import org.testng.ITestNGMethod;
import org.testng.TestNG;
import org.testng.TestNGException;
import org.testng.TestRunner;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.ITestAnnotation;
import org.testng.collections.Lists;
import org.testng.internal.annotations.AnnotationHelper;
import org.testng.internal.annotations.IAnnotationFinder;
import org.testng.log.TextFormatter;
import org.testng.xml.XmlClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.internal.Utils;
import org.testng.reporters.HtmlHelper;
import org.testng.xml.XmlSuite;
import static processor.Processor.Summarydetails; 
import static processor.Processor.procedurecontainer;
import static processor.Processor.statuscontainer;
import static processor.Processor.classcontainer;
import static processor.Processor.ordercontainer;

public class ReportGenerator implements IReporter {
	private String m_outputDirectory;
	public static final String REPORTER_OUTPUT = "customized-report.html";
	public static final String TESTNG_XML = "testng.xml.html";

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
//	    m_outputDirectory = generateOutputDirectoryName(outputDirectory + File.separator + "old");
		m_outputDirectory = generateOutputDirectoryName(outputDirectory);

	    try {
	      HtmlHelper.generateStylesheet(outputDirectory);
	    } catch (IOException e) {
	      //  TODO Propagate the exception properly.
	      e.printStackTrace();
	    }

	    for (int i = 0; i < suites.size(); i++) {

	      //
	      // Generate the various reports
	      //
	      ISuite suite = suites.get(i);
	      XmlSuite xmlSuite = suite.getXmlSuite();
	      if (xmlSuite.getTests().size() == 0) {
	        continue;
	      }
	      
   
	      generateReporterOutput(xmlSuite, suite);


	    }

	    generateIndex(suites);
	  }

	  /**
	   * Overridable by subclasses to create different directory names (e.g. with timestamps).
	   * @param outputDirectory the output directory specified by the user
	   */
	
	  protected String generateOutputDirectoryName(String outputDirectory) {
		    return outputDirectory;
	  }
	  
	 
	  
	  private void generateReporterOutput(XmlSuite xmlSuite, ISuite suite) {
		  
		    StringBuffer sb = new StringBuffer();
		    
		    
		    // Summary output
		    // 00CC33 Green Color
		    //#FF3333 Red Color
		    
		    
		    sb.append("<h2><font size='6' color='Brown'>Summary Report</font></h2>")
		    	.append("<table  border=\"4\"cellspacing=\"0\">");
	
		    		sb.append("<tr><td><b><font size='4' color='Black'>Test</font></b></td><td><b><font size='4' color='Black'>Total Procedure</font></b></td><td><b><font size='4' color='Black'>Procedure Passed</font></b></td><td><b><font size='4' color='Black'>Procedure Failed</font></b></td><td><b><font size='4' color='Black'>Procedure Skipped</font></b></td><td><b><font size='4' color='Black'>Total Time</font></b></td></tr>");
					sb.append("<tr><td><b><font size='4' color='Black'>"+Summarydetails.get(0)+"</font></b></td><td><b><font size='4' color='Black'>"+Summarydetails.get(1)+"</font></b></td><td bgcolor=\"00CC33\"><b><font size='4' color='Black'>"+Summarydetails.get(2)+"</font></b></td><td  bgcolor=\"#FF3333\"><b><font size='4' color='Black'>"+Summarydetails.get(3)+"</font></b></td><td><b><font size='4' color='Black'>"+Summarydetails.get(4)+"</font></b></td><td><b><font size='4' color='Black'>"+Summarydetails.get(5)+"</font></b></td></tr>");

		    sb.append("</table>");
		    
		    
		    // Detail output
		    
//		    Reporter.log("<tr><td><b><font size='6' color='Brown'>Detailed Report</font></b></td></tr>");
//			Reporter.log("<a id=\"Detail\">");
//			Reporter.log("<table border=\"4\" cellspacing=\"0\"");	
//			Reporter.log("<tr bgcolor=\"Lime\"><td><b><font size='4' color='Black'>Procedure Class</font></b></td><td><b><font size='4' color='Black'>Procedure Name</font></b></td><td><b><font size='4' color='Black'>Procedure Order</font></b></td><td><b><font size='4' color='Black'>Procedure Status</font></b></td></tr>"); //writing the heading 'Parameter Name' in the first 'td'
//			for (int i = 0; i < procedurecontainer.length; i++) {					
//				if (statuscontainer[i].equals("Pass")) {
//					Reporter.log("<tr cellspacing=\"0\" bgcolor=\"Lime\"><td><b><font size='4' color='Black'>"+classcontainer[i]+"</font></b></td><td><b><font size='4' color='Black'><a href=\"#m"+ordercontainer[i]+"\">"+procedurecontainer[i]+"</a></font></b></td><td><b><font size='4' color='Black'>"+ordercontainer[i]+"</font></b></td><td><b><font size='4' color='Black'>"+statuscontainer[i]+"</font></b></td></tr>"); //writing the heading 'Parameter Name' in the first 'td'	
//				}else if (statuscontainer[i].equals("Fail")) {
//					Reporter.log("<tr bgcolor=\"#FF3333\"><td><b><font size='4' color='Black'>"+classcontainer[i]+"</font></b></td><td><b><font size='4' color='Black'><a href=\"#m"+ordercontainer[i]+"\">"+procedurecontainer[i]+"</a></font></b></td><td><b><font size='4' color='Black'>"+ordercontainer[i]+"</font></b></td><td><b><font size='4' color='Black'>"+statuscontainer[i]+"</font></b></td></tr>"); //writing the heading 'Parameter Name' in the first 'td'
//				}else if (statuscontainer[i].equals("Skip")) {
//					Reporter.log("<tr bgcolor=\"Yellow\"><td><b><font size='4' color='Black'>"+classcontainer[i]+"</font></b></td><td><b><font size='4' color='Black'><a href=\"#m"+ordercontainer[i]+"\">"+procedurecontainer[i]+"</a></font></b></td><td><b><font size='4' color='Black'>"+ordercontainer[i]+"</font></b></td><td><b><font size='4' color='Black'>"+statuscontainer[i]+"</font></b></td></tr>"); //writing the heading 'Parameter Name' in the first 'td'
//				}
//				
//			}
//			Reporter.log("</table>");
//			Reporter.log("</a>");
		    
		    
		    sb.append("<h2><font size='6' color='Brown'>Detailed Report</font></h2>")
		    .append("<a id=\"Detail\">")		   
	    	.append("<table  border=\"4\"cellspacing=\"0\">");
		    sb.append("<tr bgcolor=\"00CC33\"><td><b><font size='4' color='Black'>Procedure Class</font></b></td><td><b><font size='4' color='Black'>Procedure Name</font></b></td><td><b><font size='4' color='Black'>Procedure Order</font></b></td><td><b><font size='4' color='Black'>Procedure Status</font></b></td></tr>");
	    	
			for (int i = 0; i < procedurecontainer.length; i++) {					
			if (statuscontainer[i].equals("Pass")) {
				sb.append("<tr cellspacing=\"0\" bgcolor=\"00CC33\"><td><b><font size='4' color='Black'>"+classcontainer[i]+"</font></b></td><td><b><font size='4' color='Black'><a href=\"#m"+ordercontainer[i]+"\">"+procedurecontainer[i]+"</a></font></b></td><td><b><font size='4' color='Black'>"+ordercontainer[i]+"</font></b></td><td><b><font size='4' color='Black'>"+statuscontainer[i]+"</font></b></td></tr>"); //writing the heading 'Parameter Name' in the first 'td'	
			}else if (statuscontainer[i].equals("Fail")) {
				sb.append("<tr bgcolor=\"#FF3333\"><td><b><font size='4' color='Black'>"+classcontainer[i]+"</font></b></td><td><b><font size='4' color='Black'><a href=\"#m"+ordercontainer[i]+"\">"+procedurecontainer[i]+"</a></font></b></td><td><b><font size='4' color='Black'>"+ordercontainer[i]+"</font></b></td><td><b><font size='4' color='Black'>"+statuscontainer[i]+"</font></b></td></tr>"); //writing the heading 'Parameter Name' in the first 'td'
			}else if (statuscontainer[i].equals("Skip")) {
				sb.append("<tr bgcolor=\"Yellow\"><td><b><font size='4' color='Black'>"+classcontainer[i]+"</font></b></td><td><b><font size='4' color='Black'><a href=\"#m"+ordercontainer[i]+"\">"+procedurecontainer[i]+"</a></font></b></td><td><b><font size='4' color='Black'>"+ordercontainer[i]+"</font></b></td><td><b><font size='4' color='Black'>"+statuscontainer[i]+"</font></b></td></tr>"); //writing the heading 'Parameter Name' in the first 'td'
			}
		
		}
		   

			sb.append("</table>");
		    
		    //
		    // Reporter output
		    //
		    sb.append("<h2>Reporter output</h2>")
		      .append("<table>");
		    List<String> output = Reporter.getOutput();
		    for (String line : output) {
		      sb.append("<tr><td>").append(line).append("</td></tr>\n");
		    }

		    sb.append("</table>");

//		    Utils.writeFile(getOutputDirectory(xmlSuite), REPORTER_OUTPUT, sb.toString());
		    Utils.writeFile(getOutputDirectory(), REPORTER_OUTPUT, sb.toString());
		  }
//	  private String getOutputDirectory(XmlSuite xmlSuite) {
//		    return m_outputDirectory + File.separatorChar + xmlSuite.getName();
//		  }
	  private String getOutputDirectory() {
		    return m_outputDirectory;
		  }
	  
//	  public static void writeFile(String outputDir, String fileName, String sb) {
//		    final String outDirPath= outputDir != null ? outputDir : "";
//		    final File outDir= new File(outDirPath);
//		    writeFile(outDir, fileName, sb, null, false /* don't append */);
//		  }
		  

	  
	  
	  private void generateIndex(List<ISuite> suites) {
		    StringBuffer sb = new StringBuffer();
		    String title = "Test results";
		    sb.append("<html>\n<head><title>" + title + "</title>")
		      .append(HtmlHelper.getCssString("."))
		      .append("</head><body>\n")
		      .append("<h2><p align='center'>").append(title).append("</p></h2>\n")
		      .append("<table border='1' width='100%' class='main-page'>")
		      .append("<tr><th>Suite</th><th>Passed</th><th>Failed</th><th>Skipped</th><th>testng.xml</th></tr>\n");

		    int totalFailedTests = 0;
		    int totalPassedTests = 0;
		    int totalSkippedTests = 0;

		    StringBuffer suiteBuf= new StringBuffer();
		    for (ISuite suite : suites) {
		      if (suite.getResults().size() == 0) {
		        continue;
		      }

		      String name = suite.getName();

		      int failedTests= 0;
		      int passedTests= 0;
		      int skippedTests= 0;

		      Map<String, ISuiteResult> results = suite.getResults();
		      for (ISuiteResult result : results.values()) {
		        ITestContext context = result.getTestContext();
		        failedTests += context.getFailedTests().size();
		        totalFailedTests += context.getFailedTests().size();
		        passedTests += context.getPassedTests().size();
		        totalPassedTests += context.getPassedTests().size();
		        skippedTests += context.getSkippedTests().size();
		        totalSkippedTests += context.getSkippedTests().size();
		      }

		      String cls = failedTests > 0 ? "invocation-failed"
		          : (passedTests > 0  ? "invocation-passed" : "invocation-failed");
		      suiteBuf.append("<tr align='center' class='").append(cls).append("'>")
		        .append("<td><a href='").append(name).append("/index.html'>")
		        .append(name).append("</a></td>\n");
		      suiteBuf.append("<td>" + passedTests + "</td>")
		        .append("<td>" + failedTests + "</td>")
		        .append("<td>" + skippedTests + "</td>")
		        .append("<td><a href='").append(name).append("/").append(TESTNG_XML).append("'>Link").append("</a></td>")
		        .append("</tr>");

		    }

		    String cls= totalFailedTests > 0 ? "invocation-failed"
		        : (totalPassedTests > 0 ? "invocation-passed" : "invocation-failed");
		    sb.append("<tr align='center' class='").append(cls).append("'>")
		      .append("<td><em>Total</em></td>")
		      .append("<td><em>").append(totalPassedTests).append("</em></td>")
		      .append("<td><em>").append(totalFailedTests).append("</em></td>")
		      .append("<td><em>").append(totalSkippedTests).append("</em></td>")
		      .append("<td>&nbsp;</td>")
		      .append("</tr>\n");
		    sb.append(suiteBuf);
		    sb.append("</table>").append("</body></html>\n");

		    Utils.writeFile(m_outputDirectory, "index.html", sb.toString());
		  }

	  private static final String LINE_SEP = System.getProperty("line.separator");

	  public static final char[] SPECIAL_CHARACTERS =
	      {'*','/','\\','?','%',':',';','<','>','&','~','|'};
	  public static final char CHAR_REPLACEMENT = '_';
	  public static final char UNICODE_REPLACEMENT = 0xFFFD;

	  /**
	   * Hide constructor for utility class.
	   */

	  /**
	   * Splits the given String s into tokens where the separator is
	   * either the space character or the comma character. For example,
	   * if s is "a,b, c" this method returns {"a", "b", "c"}
	   *
	   * @param s the string to split
	   * @return the split token
	   */
	  public static String[] stringToArray(String s) {
	    // TODO CQ would s.split() be a better way of doing this?
	    StringTokenizer st = new StringTokenizer(s, " ,");
	    String[] result = new String[st.countTokens()];
	    for (int i = 0; i < result.length; i++) {
	      result[i] = st.nextToken();
	    }

	    return result;
	  }

	  public static XmlClass[] classesToXmlClasses(Class<?>[] classes) {
	    List<XmlClass> result = Lists.newArrayList();

	    for (Class<?> cls : classes) {
	      result.add(new XmlClass(cls, true /* load classes */));
	    }

	    return result.toArray(new XmlClass[classes.length]);
	  }

	  public static String[] parseMultiLine(String line) {
	    List<String> vResult = Lists.newArrayList();
	    if (isStringNotBlank(line)) {
	      StringTokenizer st = new StringTokenizer(line, " ");
	      while (st.hasMoreTokens()) {
	        vResult.add(st.nextToken());
	      }
	      // Bug in split when passed " " : returns one too many result
	      //      result = line.split(" ");
	    }

	    return vResult.toArray(new String[vResult.size()]);
	  }

	  /**
	   * Writes the content of the sb string to the file named filename in outDir encoding the output as UTF-8.
	   * If outDir does not exist, it is created.
	   *
	   * @param outputDir the output directory (may not exist). If <tt>null</tt> then current directory is used.
	   * @param fileName the filename
	   * @param sb the file content
	   */
	  public static void writeUtf8File(String outputDir, String fileName, String sb) {
	    final String outDirPath= outputDir != null ? outputDir : "";
	    final File outDir= new File(outDirPath);
	    writeFile(outDir, fileName, escapeUnicode(sb), "UTF-8", false /* don't append */);
	  }

	  /**
	   * Writes the content of the sb string to the file named filename in outDir. If
	   * outDir does not exist, it is created.
	   *
	   * @param outputDir the output directory (may not exist). If <tt>null</tt> then current directory is used.
	   * @param fileName the filename
	   * @param sb the file content
	   */
	  public static void writeFile(String outputDir, String fileName, String sb) {
	    final String outDirPath= outputDir != null ? outputDir : "";
	    final File outDir= new File(outDirPath);
	    writeFile(outDir, fileName, sb, null, false /* don't append */);
	  }

	  /**
	   * Appends contents of the string to the specified file. If output directory/file don't
	   * exist, they are created.
	   * @param outputDir output directory. If <tt>null</tt>, then current directory is used
	   * @param fileName file name
	   * @param sb string to be appended to file
	   */
	  public static void appendToFile(String outputDir, String fileName, String sb) {
	     String outDirPath= outputDir != null ? outputDir : "";
	     File outDir= new File(outDirPath);
	     writeFile(outDir, fileName, sb, null, true /* append */);
	  }

	  /**
	   * Writes the content of the sb string to the file named filename in outDir. If
	   * outDir does not exist, it is created.
	   *
	   * @param outDir the output directory (may not exist). If <tt>null</tt> then current directory is used.
	   * @param fileName the filename
	   * @param sb the file content
	   */
	  private static void writeFile(File outDir, String fileName, String sb, String encoding, boolean append) {
	    try {
	      if (!outDir.exists()) {
	        outDir.mkdirs();
	      }

	      fileName = replaceSpecialCharacters(fileName);
	      File outputFile = new File(outDir, fileName);
	      if (!append) {
	        outputFile.delete();
	        outputFile.createNewFile();
	      }
	      writeFile(outputFile, sb, encoding, append);
	    }
	    catch (IOException e) {
	      if (TestRunner.getVerbose() > 1) {
	        e.printStackTrace();
	      }
	      else {
	        log("[Utils]", 1, e.getMessage());
	      }
	    }
	  }

	  private static void writeFile(File outputFile, String sb, String encoding, boolean append) {
	    BufferedWriter fw = null;
	    try {
	      if (!outputFile.exists()) {
	        outputFile.createNewFile();
	      }
	      OutputStreamWriter osw= null;
	      if (null != encoding) {
	        osw = new OutputStreamWriter(new FileOutputStream(outputFile, append), encoding);
	      }
	      else {
	        osw = new OutputStreamWriter(new FileOutputStream(outputFile, append));
	      }
	      fw = new BufferedWriter(osw);
	      fw.write(sb);

	      Utils.log("", 3, "Creating " + outputFile.getAbsolutePath());
	    }
	    catch(IOException ex) {
	      if (TestRunner.getVerbose() > 1) {
	        System.err.println("ERROR WHILE WRITING TO " + outputFile);
	        ex.printStackTrace();
	      }
	      else {
	        log("[Utils]", 1, "Error while writing to " + outputFile + ": " + ex.getMessage());
	      }
	    }
	    finally {
	      try {
	        if (fw != null) {
	          fw.close();
	        }
	      }
	      catch (IOException e) {
	        ; // ignore
	      }
	    }
	  }

	  private static void ppp(String s) {
	    Utils.log("Utils", 0, s);
	  }

	  /**
	   * @param result
	   */
	  public static void dumpMap(Map<?, ?> result) {
	    System.out.println("vvvvv");
	    for (Map.Entry<?, ?> entry : result.entrySet()) {
	      System.out.println(entry.getKey() + " => " + entry.getValue());
	    }
	    System.out.println("^^^^^");
	  }

	  /**
	   * @param allMethods
	   */
	  public static void dumpMethods(List<ITestNGMethod> allMethods) {
	    ppp("======== METHODS:");
	    for (ITestNGMethod tm : allMethods) {
	      ppp("  " + tm);
	    }
	  }

	  /**
	   * @return The list of dependent groups for this method, including the
	   * class groups
	   */
	  public static String[] dependentGroupsForThisMethodForTest(Method m, IAnnotationFinder finder) {
	    List<String> vResult = Lists.newArrayList();
	    Class<?> cls = m.getDeclaringClass();

	    // Collect groups on the class
	    ITestAnnotation tc = AnnotationHelper.findTest(finder, cls);
	    if (null != tc) {
	      for (String group : tc.getDependsOnGroups()) {
	        vResult.add(group);
	      }
	    }

	    // Collect groups on the method
	    ITestAnnotation tm = AnnotationHelper.findTest(finder, m);
	    if (null != tm) {
	      String[] groups = tm.getDependsOnGroups();

	      //       ppp("Method:" + m + " #Groups:" + groups.length);
	      for (String group : groups) {
	        vResult.add(group);
	      }
	    }

	    return vResult.toArray(new String[vResult.size()]);
	  }

	  /**
	   * @return The list of groups this method belongs to, including the
	   * class groups
	   */
	  public static String[] groupsForThisMethodForTest(Method m, IAnnotationFinder finder) {
	    List<String> vResult = Lists.newArrayList();
	    Class<?> cls = m.getDeclaringClass();

	    // Collect groups on the class
	    ITestAnnotation tc = AnnotationHelper.findTest(finder, cls);
	    if (null != tc) {
	      for (String group : tc.getGroups()) {
	        vResult.add(group);
	      }
	    }

	    // Collect groups on the method
	    ITestAnnotation tm = AnnotationHelper.findTest(finder, m);
	    if (null != tm) {
	      String[] groups = tm.getGroups();

	      //       ppp("Method:" + m + " #Groups:" + groups.length);
	      for (String group : groups) {
	        vResult.add(group);
	      }
	    }

	    return vResult.toArray(new String[vResult.size()]);
	  }

	  /**
	   * @return The list of groups this method belongs to, including the
	   * class groups
	   */
	  public static String[] groupsForThisMethodForConfiguration(Method m, IAnnotationFinder finder) {
	    String[] result = {};

	    // Collect groups on the method
	    ITestAnnotation tm = AnnotationHelper.findTest(finder, m);
	    if (null != tm) {
	      result = tm.getGroups();
	    }

	    return result;
	  }

	  /**
	   * @return The list of groups this method depends on, including the
	   * class groups
	   */
	  public static String[] dependentGroupsForThisMethodForConfiguration(Method m,
	                                                                      IAnnotationFinder finder) {
	    String[] result = {};

	    // Collect groups on the method
	    IConfigurationAnnotation tm = AnnotationHelper.findConfiguration(finder, m);
	    if (null != tm) {
	      result = tm.getDependsOnGroups();
	    }

	    return result;
	  }

	  public static void log(String msg) {
	    log("Utils", 2, msg);
	  }

	  /**
	   * Logs the the message to System.out if level is greater than
	   * or equal to TestRunner.getVerbose(). The message is logged as:
	   * <pre>
	   *     "[cls] msg"
	   * </pre>
	   *
	   * @param cls the class name to prefix the log message.
	   * @param level the logging level of the message.
	   * @param msg the message to log to System.out.
	   */
	  public static void log(String cls, int level, String msg) {
	    // Why this coupling on a static member of TestRunner.getVerbose()?
	    if (TestRunner.getVerbose() >= level) {
	      if (cls.length() > 0) {
	        System.out.println("[" + cls + "] " + msg);
	      }
	      else {
	        System.out.println(msg);
	      }
	    }
	  }

	  public static void error(String errorMessage) {
	    System.err.println("[Error] " + errorMessage);
	  }

	  /**
	   * @return The number of methods invoked, taking into account the number
	   * of instances.
	   */
	//  public static int calculateInvokedMethodCount(IResultMap map) {
//	    return calculateInvokedMethodCount(
//	        (ITestNGMethod[]) map.getAllMethods().toArray(new ITestNGMethod[map.size()]));
	//  }

	  public static int calculateInvokedMethodCount(ITestNGMethod[] methods) {
	    return methods.length;
//	    int result = 0;
	//
//	    for (ITestNGMethod method : methods) {
//	      int instanceCount = method.getInvocationCount();
//	      result += instanceCount;
//	    }
	//
//	    return result;
	  }

	//  public static int calculateInvokedMethodCount(Map<ITestNGMethod, ITestResult> methods) {
//	    return calculateInvokedMethodCount(methods.keySet().toArray(new ITestNGMethod[methods.values()
//	                                                                .size()]));
	//  }

	  /**
	   * Tokenize the string using the separator.
	   */
	  public static String[] split(String string, String sep) {
	    if ((string == null) || (string.length() == 0)) {
	      return new String[0];
	    }

	    // TODO How different is this from:
	    // return string.split(sep);

	    int start = 0;
	    int idx = string.indexOf(sep, start);
	    int len = sep.length();
	    List<String> strings = Lists.newArrayList();

	    while (idx != -1) {
	      strings.add(string.substring(start, idx).trim());
	      start = idx + len;
	      idx = string.indexOf(sep, start);
	    }

	    strings.add(string.substring(start).trim());

	    return strings.toArray(new String[strings.size()]);
	  }

	  public static void initLogger(Logger logger, String outputLogPath) {
	    try {
	      logger.setUseParentHandlers(false);
	      FileHandler fh = new FileHandler(outputLogPath);
	      fh.setFormatter(new TextFormatter());
	      fh.setLevel(Level.INFO);
	      logger.addHandler(fh);
	    }
	    catch (SecurityException se) {
	      se.printStackTrace();
	    }
	    catch (IOException ioe) {
	      ioe.printStackTrace();
	    }
	  }

	  public static void logInvocation(String reason, Method thisMethod, Object[] parameters) {
	    String clsName = thisMethod.getDeclaringClass().getName();
	    int n = clsName.lastIndexOf(".");
	    if (n >= 0) {
	      clsName = clsName.substring(n + 1);
	    }
	    String methodName = clsName + '.' + thisMethod.getName();
	    if (TestRunner.getVerbose() >= 2) {
	      StringBuffer paramString = new StringBuffer();
	      if (parameters != null) {
	        for (Object p : parameters) {
	          paramString.append(p.toString()).append(' ');
	        }
	      }
	      log("", 2, "Invoking " + reason + methodName + '(' + paramString + ')');
	    }
	  }

	  public static void writeResourceToFile(File file, String resourceName, Class<?> clasz) throws IOException {
	    InputStream inputStream = clasz.getResourceAsStream("/" + resourceName);
	    if (inputStream == null) {
	      System.err.println("Couldn't find resource on the class path: " + resourceName);
//	      throw new IllegalArgumentException("Resource does not exist: " + resourceName);
	    }

	    else {

	      try {
	        FileOutputStream outputStream = new FileOutputStream(file);
	        try {
	          int nread;
	          byte[] buffer = new byte[4096];
	          while (0 < (nread = inputStream.read(buffer))) {
	            outputStream.write(buffer, 0, nread);
	          }
	        } finally {
	          outputStream.close();
	        }
	      } finally {
	        inputStream.close();
	      }
	    }
	  }

	  public static String defaultIfStringEmpty(String s, String defaultValue) {
	    return isStringEmpty(s) ? defaultValue : s;
	  }

	  public static boolean isStringBlank(String s) {
	    return s == null || "".equals(s.trim());
	  }

	  public static boolean isStringEmpty(String s) {
	    return s == null || "".equals(s);
	  }

	  public static boolean isStringNotBlank(String s) {
	    return !isStringBlank(s);
	  }

	  public static boolean isStringNotEmpty(String s) {
	    return !isStringEmpty(s);
	  }

	  public static String[] stackTrace(Throwable t, boolean tohtml) {
	    StringWriter sw = new StringWriter();
	    PrintWriter pw = new PrintWriter(sw);
	    t.printStackTrace(pw);
	    pw.flush();

	    String fullStackTrace = sw.getBuffer().toString();
	    String shortStackTrace;

	    if (Boolean.getBoolean(TestNG.SHOW_TESTNG_STACK_FRAMES) || TestRunner.getVerbose() >= 2) {
	      shortStackTrace = fullStackTrace;
	    }
	    else {
	      shortStackTrace = filterTrace(sw.getBuffer().toString());
	    }

	    if (tohtml) {
	      shortStackTrace = escapeHtml(shortStackTrace);
	      fullStackTrace = fullStackTrace.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
	    }

	    return new String[] {
	        shortStackTrace, fullStackTrace
	    };
	  }

	  private static final Map<Character, String> ESCAPES = new HashMap<Character, String>() {/**
	     *
	     */
	    private static final long serialVersionUID = 1285607660247157523L;

	  {
	    put('<', "&lt;");
	    put('>', "&gt;");
	    put('\'', "&apos;");
	    put('"', "&quot;");
	  }};

	  public static String escapeHtml(String s) {
	    if (s == null) {
	      return null;
	    }

	    StringBuilder result = new StringBuilder();

	    for (int i = 0; i < s.length(); i++) {
	      char c = s.charAt(i);
	      String nc = ESCAPES.get(c);
	      if (nc != null) {
	        result.append(nc);
	      } else {
	        result.append(c);
	      }
	    }

	    return result.toString();
	  }

	  public static String escapeUnicode(String s) {
	    if (s == null) {
	      return null;
	    }

	    StringBuilder result = new StringBuilder();

	    for (int i = 0; i < s.length(); i++) {
	      char c = s.charAt(i);
	      char ca = (Character.isDefined(c)) ? c: UNICODE_REPLACEMENT;
	      result.append(ca);
	    }

	    return result.toString();
	  }

	  private static String filterTrace(String trace) {
	    StringReader   stringReader = new StringReader(trace);
	    BufferedReader bufferedReader = new BufferedReader(stringReader);
	    StringBuffer buf = new StringBuffer();

	    try {
	      // first line contains the thrown exception
	      String line = bufferedReader.readLine();
	      if(line == null) {
	        return "";
	      }
	      buf.append(line).append(LINE_SEP);

	      //
	      // the stack frames of the trace
	      //
	      String[] excludedStrings = new String[] {
	          "org.testng",
	          "reflect"
	      };

	      int excludedCount = 0;
	      while((line = bufferedReader.readLine()) != null) {
	        boolean isExcluded = false;
	        for (String excluded : excludedStrings) {
	          if(line.indexOf(excluded) != -1) {
	            isExcluded = true;
	            excludedCount++;
	            break;
	           }
	        }
	        if (! isExcluded) {
	          buf.append(line).append(LINE_SEP);
	        }
	      }
	      if (excludedCount > 0) {
	        buf.append("... Removed " + excludedCount + " stack frames");
	      }
	    }
	    catch(IOException ioex) {
	      ; // do nothing
	    }

	    return buf.toString();
	  }

	  /**
	   * @param object
	   * @return
	   */
	  public static String toString(Object object, Class<?> objectClass) {
	    if(null == object) {
	      return "null";
	    }
	    final String toString= object.toString();
	    if(isStringEmpty(toString)) {
	      return "\"\"";
	    }
	    else if (String.class.equals(objectClass)) {
	      return "\"" + toString + '\"';
	    }
	    else {
	      return toString;
	    }
	  }

	  /**
	   * @param method
	   * @return
	   */
	  public static String detailedMethodName(ITestNGMethod method, boolean fqn) {
	    StringBuffer buf= new StringBuffer();
	    if(method.isBeforeSuiteConfiguration()) {
	      buf.append("@BeforeSuite ");
	    }
	    else if(method.isBeforeTestConfiguration()) {
	      buf.append("@BeforeTest ");
	    }
	    else if(method.isBeforeClassConfiguration()) {
	      buf.append("@BeforeClass ");
	    }
	    else if(method.isBeforeGroupsConfiguration()) {
	      buf.append("@BeforeGroups ");
	    }
	    else if(method.isBeforeMethodConfiguration()) {
	      buf.append("@BeforeMethod ");
	    }
	    else if(method.isAfterMethodConfiguration()) {
	      buf.append("@AfterMethod ");
	    }
	    else if(method.isAfterGroupsConfiguration()) {
	      buf.append("@AfterGroups ");
	    }
	    else if(method.isAfterClassConfiguration()) {
	      buf.append("@AfterClass ");
	    }
	    else if(method.isAfterTestConfiguration()) {
	      buf.append("@AfterTest ");
	    }
	    else if(method.isAfterSuiteConfiguration()) {
	      buf.append("@AfterSuite ");
	    }

	    return buf.append(fqn ? method.toString() : method.getMethodName()).toString();
	  }

	  public static String arrayToString(String[] strings) {
	    StringBuffer result = new StringBuffer("");
	    if ((strings != null) && (strings.length > 0)) {
	      for (int i = 0; i < strings.length; i++) {
	        result.append(strings[i]);
	        if (i < strings.length - 1) {
	          result.append(", ");
	        }
	      }
	    }
	    return result.toString();
	  }

	  /**
	   * If the file name contains special characters like *,/,\ and so on,
	   * exception will be thrown and report file will not be created.<br>
	   * Special characters are platform specific and they are not same for
	   * example on Windows and Macintosh. * is not allowed on Windows, but it is on Macintosh.<br>
	   * In order to have the same behavior of testng on the all platforms, characters like * will
	   * be replaced on all platforms whether they are causing the problem or not.
	   *
	   * @param fileName file name that could contain special characters.
	   * @return fileName with special characters replaced
	   * @author Borojevic
	   */
	  public static String replaceSpecialCharacters(String fileName) {
	   if (fileName == null || fileName.length() == 0) {
	     return fileName;
	   }
	   for (char element : SPECIAL_CHARACTERS) {
	     fileName = fileName.replace(element, CHAR_REPLACEMENT);
	   }

	   return fileName;
	  }

	  public static String joinStrings(Iterable<String> iterable, String separator) {
	    StringBuilder sb = new StringBuilder();
	    Iterator<String> iterator = iterable.iterator();
	    if (iterator.hasNext()) {
	      sb.append(iterator.next());
	    }
	    while (iterator.hasNext()) {
	      sb.append(separator);
	      sb.append(iterator.next());
	    }
	    return sb.toString();
	  }

	  public static String join(List<String> s, String separator) {
	    return joinStrings(s, separator + " ");
	  }

	  public static String joinClasses(List<Class> classes, String separator) {
	    StringBuilder sb = new StringBuilder();
	    int i = 0;
	    for (Class s : classes) {
	      if (i++ > 0) {
	        sb.append(separator);
	      }
	      sb.append(s.getName());
	    }

	    return sb.toString();
	  }

	  public static void copyFile(File from, File to) {
	    try{
	      InputStream in = new FileInputStream(from);

	      //For Append the file.
//	        OutputStream out = new FileOutputStream(f2,true);

	      //For Overwrite the file.
	      to.getParentFile().mkdirs();
	      OutputStream out = new FileOutputStream(to);

	      byte[] buf = new byte[1024];
	      int len;
	      while ((len = in.read(buf)) > 0){
	        out.write(buf, 0, len);
	      }
	      in.close();
	      out.close();
	    }
	    catch(FileNotFoundException ex){
	      ex.printStackTrace();
	    }
	    catch(IOException e){
	      e.printStackTrace();
	    }
	  }

	  /**
	   * @return a temporary file with the given content.
	   */
	  public static File createTempFile(String content) {
	    try {
	      // Create temp file.
	      File result = File.createTempFile("testng-tmp", "");

	      // Delete temp file when program exits.
	      result.deleteOnExit();

	      // Write to temp file
	      BufferedWriter out = new BufferedWriter(new FileWriter(result));
	      out.write(content);
	      out.close();

	      return result;
	    } catch (IOException e) {
	      throw new TestNGException(e);
	    }
	  }

	  /**
	   * Make sure that either we have an instance or if not, that the method is static
	   */
	  public static void checkInstanceOrStatic(Object instance, Method method) {
	    if (instance == null && ! Modifier.isStatic(method.getModifiers())) {
	      throw new TestNGException("Can't invoke " + method + ": either make it static or add "
	          + "a no-args constructor to your class");
	    }
	  }
	

	



}
