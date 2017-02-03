package procedures_NewFramework.AYSmoke.Recommendations;

import com.thoughtworks.selenium.webdriven.commands.Close;
import or.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

import java.util.Iterator;
import java.util.Set;

public class Rec_Facelift_Forgotpwd_SysMsg extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in 'Recommendation Login' page")
	public void Rec_Facelift_Forgotpwd_SysMsg() throws Exception{
		try {
		Iterator<String> originalHandle = driver.getWindowHandles().iterator();
		String parent = originalHandle.next();
		writeDetails();
		String[] testdata = datacontainer;
		String Forgot_SysMsg = testdata[0];
		String CloseMsg = testdata[1];
		if(!Forgot_SysMsg.equals("")) {
			//waitForText(Forgot_SysMsg, "Forgot your Personal Access Code or Password?");
			waitForPageToLoadWebdriver();
			waitForElementPresentVerifyContainsTextWebdriver(attributeName_xpath, RF_Forgot_Msg, Forgot_SysMsg, Forgot_SysMsg);
		}
		if(!CloseMsg.equals("")){
			driver.findElement(By.xpath("//button[@id='modalClose']")).click();
			driver.close();
			driver.switchTo().window(parent);
		}
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}
