package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegisterTP {
    private WebDriver driver;

    private By firstName = By.xpath("//*[@id='firstname']");
    private By lastName = By.xpath("//*[@id='lastname']");
    private By userName = By.xpath("//*[@id='username']");
    private By password = By.xpath("//*[@id='password']");
    private By registerButton = By.xpath("//*[@id='signupForm']/div[5]/input");

    public RegisterTP(WebDriver driver) {
        this.driver = driver;
    }


    public void enterFirstName(String fn) {
    	driver.findElement(firstName).sendKeys(fn); 
    }
    
    public void enterLastName(String ln) {
    	driver.findElement(lastName).sendKeys(ln); 
   	}
    
    public void enterUserName(String un) {
    	driver.findElement(userName).sendKeys(un); 
   	}
    
    public void enterPassword(String pwd) {
    	driver.findElement(password).sendKeys(pwd); 
   	}
    
    public void clickRegister() {
    	driver.findElement(registerButton).click(); 
   	}
}
