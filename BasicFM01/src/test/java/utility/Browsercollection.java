package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsercollection {
	
	public static WebDriver StartApp(WebDriver driver, String Browsername, String AppUrl)

	{
		if (Browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Browsername.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (Browsername.equals("gecko")) {
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Browser not Supported");
		}
		
		driver.manage().window().maximize();
		driver.get(AppUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	public static void QuitBrowser(WebDriver driver)

	{
		//driver.quit();
	}


}
