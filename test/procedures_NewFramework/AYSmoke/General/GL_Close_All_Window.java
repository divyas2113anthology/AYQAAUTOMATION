package procedures_NewFramework.AYSmoke.General;

import io.github.bonigarcia.wdm.WebDriverManager;
import or.OR;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class GL_Close_All_Window extends CommonSeleniumActions implements OR {

    @Test(description="This procedure is to Navigate URL")
    public void GL_Close_All_Window() throws Exception{
        try {
            WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
             driver.quit();

        } catch (Exception e) {
            writeFailure(e.getLocalizedMessage());
        }
        }

}
