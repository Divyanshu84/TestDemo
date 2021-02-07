package pages;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	// Create two static varibale
		public static WebDriver driver;
		public static Properties prop;
		
		// Read the config file
		
		
		// Create cons..
		
		public Base() 
		{
			
			prop= new Properties();
			FileInputStream fin;
			try
			{
				fin= new FileInputStream("src\\test\\java\\config\\cionfig.properties");
				
				prop.load(fin);
			
			}
			catch (FileNotFoundException e)
			{
				
				e.printStackTrace();
			}
			
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
			
		}
		

		public static void initialization() throws InterruptedException
		
		{
			System.out.println("Read Test Base Java");
		//	String brName = prop.getProperty("browser");
			
			
	/*		String Path = System.getProperty("user.dir")+"/Driver/chromedriver.exe";
			System.setProperty("WebDriver.chrome.driver",Path);
			WebDriver driver = new ChromeDriver();*/
									
			System.setProperty("webdriver.chrome.driver",prop.getProperty("CBrowser"));
			driver = new ChromeDriver();
			
			
			
			
			Thread.sleep(2000);
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			Thread.sleep(2000);
			driver.get(prop.getProperty("url"));
			
		}
		


}
