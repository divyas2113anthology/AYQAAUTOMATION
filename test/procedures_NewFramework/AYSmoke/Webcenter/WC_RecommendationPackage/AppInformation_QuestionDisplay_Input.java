package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class AppInformation_QuestionDisplay_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="Verifying AppInformation_QuestionDisplay Inputs from webcenter recommendation packahe-configureform-application display")
	
	public void AppInformation_QuestionDisplay_Input() throws Exception{
		try {

			String [] testdata=datacontainer;
			String display_check=testdata[0];
			String label_text=testdata[1];
			String save_button=testdata[2];

			Reporter.log("Input Test Data was retrieved for 'Application Information' Page");

			if (!display_check.equals("")){

				clickWebdriver(attributeName_xpath, AID_Display_Check);		

			}

			if (!label_text.equals("")){

				sendKeys(attributeName_xpath, AID_label_text, label_text);		

			}

			if (!save_button.equals("")){

				clickWebdriver(attributeName_xpath, AID_save_button);		

			}
		}catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
		//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}



	