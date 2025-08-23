package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	// Locators + Page Actions + Constructor 
	private WebDriver driver;
	
	// Locators 
	private By  usernameField = By.name("username");
	private By  passwordField = By.name("password");
	private By loginButton = By.xpath("//button[normalize-space()='Login']");
	
	// Constructor	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Page Actions 
    public void enterCredentials(String username,String password) throws InterruptedException {
    	Thread.sleep(4000);
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
    }
 
	
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
 
    public String getPageTitle() {
    	return driver.getTitle();
    }
}
