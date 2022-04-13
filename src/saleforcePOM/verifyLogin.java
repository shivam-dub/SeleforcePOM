package saleforcePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class verifyLogin {
	 @Test
	  public void TestUser() {
		  WebDriver driver = Browseroption.BrowserFactory("chrome","https://login.salesforce.com/?locale=us");
		  POM loginHRM =PageFactory.initElements(driver, POM.class);
		  loginHRM.LoginHRM("Admin","admin123");
	}
}
