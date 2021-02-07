package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base {

	By username = By.name("txtUsername");
	By password = By.name("txtPassword");
	By loginbutton = By.name("Submit");

	
	// Create a constructor

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void typeusername() {
		driver.findElement(username).sendKeys("opensourcecms");

	}

	public void enterpassword() {
		driver.findElement(password).sendKeys("opensourcecms");
	}

	public void clikloginbutton() {
		driver.findElement(loginbutton).click();
	}

}
