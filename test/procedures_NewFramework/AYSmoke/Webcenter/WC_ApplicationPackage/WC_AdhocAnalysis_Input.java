package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_AdhocAnalysis_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Adhoc Analysis' page")
	public void WC_AdhocAnalysis_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Adhoc Analysis' Page");
			String[] testdata = datacontainer;
			String activityby = testdata[0];
			String conversionanalysis = testdata[1];
			String crosstab = testdata[2];
			String custom = testdata[3];
			String question = testdata[4];
			String combinelikeresponses = testdata[5];
			String systemqueries = testdata[6];
			String userqueries = testdata[7];
			String timeperiodfrom = testdata[8];
			String timeperiodto = testdata[9];
			String format = testdata[10];
			String charttype = testdata[11];
			String button = testdata[12];
			Reporter.log("Input Test Data was retrieved for 'Adhoc Analysis' Page");
			if (!activityby.equals("")) {
				Reporter.log("Step 1 - Select activity by as ["+activityby+"]");
				waitForElementPresentWebdriverWait(attributeName_name, Ad_ActivatedBy, activityby);
				selectByVisibleTextWebdriver(attributeName_name, Ad_ActivatedBy, activityby);
			}
			
			if (!conversionanalysis.equals("")) {
				Reporter.log("Step 2 - Select conversion analysis as ["+conversionanalysis+"]");
				selectByValueWebdriver(attributeName_name, Ad_ConvAnalysis, conversionanalysis);
			}
			
			if (!crosstab.equals("")) {
				Reporter.log("Step 3 - Select crosstab as ["+crosstab+"]");
				selectByValueWebdriver(attributeName_name, Ad_CrossTab, crosstab);
			}
			
			if (!custom.equals("")) {
				Reporter.log("Step 4 - Select custom as ["+custom+"]");
				selectByVisibleTextWebdriver(attributeName_name, Ad_Customlist, custom);
			}
			
			if (!question.equals("")) {
				Reporter.log("Step 5 - Select question as ["+question+"]");
				//selectByVisibleTextWebdriver(attributeName_name, Ad_QuestionList, question);
				selectByVisibleTextWithSpaceWebdriver(attributeName_name, Ad_QuestionList, question);
			}
			
			if (!combinelikeresponses.equals("")) {
				Reporter.log("Step 6 - Select combine like responses as ["+combinelikeresponses+"]");
				
			}
			
			if (!systemqueries.equals("")) {
				Reporter.log("Step 7 - Select system queries as ["+systemqueries+"]");
				selectByVisibleTextWebdriver(attributeName_name, Ad_SysQueryList, systemqueries);
			}
			
			if (!userqueries.equals("")) {
				Reporter.log("Step 8 - Select user queries as ["+userqueries+"]");
				selectByValueWebdriver(attributeName_name, Ad_SysQueryList, userqueries);
			}
			
			if (!timeperiodfrom.equals("")) {
				Reporter.log("Step 9 - Enter time period from as ["+timeperiodfrom+"]");
				sendKeys(attributeName_name, Ad_DateFrom, timeperiodfrom);
			}
			
			if (!timeperiodto.equals("")) {
				Reporter.log("Step 10 - Enter time period from as ["+timeperiodto+"]");
				sendKeys(attributeName_name, Ad_DateTo, timeperiodto);
			}
			
			if (!format.equals("")) {
				Reporter.log("Step 11 - Select format as ["+format+"]");
				if (format.equalsIgnoreCase("HTML")) {
					clickWebdriver(attributeName_name, Ad_HTML);
				}else if (format.equalsIgnoreCase("Excel")) {
					clickWebdriver(attributeName_name, Ad_Excel);
				}
			}
			
			if (!charttype.equals("")) {
				Reporter.log("Step 12 - Select chart type as ["+charttype+"]");
				selectByVisibleTextWebdriver(attributeName_name, Ad_ChartType, charttype);
			}
			
			if (!button.equals("")) {
				Reporter.log("Step 13 - Click button as ["+button+"]");
				if (button.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, ASR_BackBtn);
					waitForPageToLoadWebdriver();
				}else if (button.equalsIgnoreCase("run analysis")) {
					clickWebdriver(attributeName_xpath, Ad_RunAnalysis);
					waitForPageToLoadWebdriver();
				}
			}			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}

