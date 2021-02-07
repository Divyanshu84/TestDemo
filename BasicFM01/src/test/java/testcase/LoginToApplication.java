package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Base;
import pages.LoginPage;

public class LoginToApplication extends Base {

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		System.out.println("Start Calling login pgae");

	}

	@Test
	public void loginTest() throws InterruptedException {
		LoginPage logn = new LoginPage(driver);

		Thread.sleep(2000);
		logn.typeusername();
		logn.enterpassword();
		logn.clikloginbutton();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
