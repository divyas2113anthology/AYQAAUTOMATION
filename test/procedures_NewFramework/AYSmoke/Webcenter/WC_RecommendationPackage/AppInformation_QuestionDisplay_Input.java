package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;

import com.thoughtworks.selenium.webdriven.commands.IsChecked;
import org.openqa.selenium.By;
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
			Boolean state;
			Reporter.log("Input Test Data was retrieved for 'Application Information' Page");
			switchToFrameNameIdWebdriver("frmContent");
			if (!display_check.equals("")){
				state = isEnabledWebdriver(attributeName_xpath,AID_Display_Check + display_check + "')]]/following-sibling::td/font/input[contains(@type,'checkbox')]");
					if(state){
						System.out.println("======");
						clickWebdriver(attributeName_xpath, AID_Display_Check + display_check + "')]]/following-sibling::td/font/input[contains(@type,'checkbox')]");
					}
					waitForElementPresentWebdriver(attributeName_xpath, AID_Display_Check + display_check + "')]]/following-sibling::td/font/input[contains(@type,'checkbox')]", display_check);
					clickWebdriver(attributeName_xpath, AID_Display_Check + display_check + "')]]/following-sibling::td/font/input[contains(@type,'checkbox')]");
					//doubleClickWebdriver(attributeName_xpath, AID_Display_Check+display_check+"')]]/following-sibling::td/font/input[contains(@type,'checkbox')]");
			}

			if (!label_text.equals("")){
				
				waitForElementPresentWebdriver(attributeName_xpath, AID_label_text, label_text);
				driver.findElement(By.xpath(AID_label_text)).click();
				sendKeys(attributeName_xpath, AID_label_text, label_text);		

			}

			if (!save_button.equals("")){

				clickWebdriver(attributeName_xpath, AID_save_button);		

			}
			switchToDefaultContentWebdriver();
		}catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
		//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}



	