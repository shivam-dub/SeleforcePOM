package saleforcePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browseroption {
	 static WebDriver driver;
	    public static WebDriver BrowserFactory(String browserName, String url)
	    {
	    	if (browserName.equalsIgnoreCase("Chrome")) {
	    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsaty\\Downloads\\Dxc Selenium Automation Class\\saleforcePOM\\Chromejar\\chromedriver.exe");
	    	    driver = new ChromeDriver();
	    	}else if (browserName.equalsIgnoreCase("Chrome")) {
	    		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dsaty\\Downloads\\Dxc Selenium Automation Class\\saleforcePOM\\Firefoxjars\\geckodriver.exe");
	    	    driver = new FirefoxDriver();
	    	}
	    	driver.manage().window().maximize();
	    	driver.get(url);
	    	return driver;
	}

}
