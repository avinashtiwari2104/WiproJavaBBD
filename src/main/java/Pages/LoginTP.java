package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTP {
    private WebDriver driver;

    // Locators
    private By userName = By.name("email");      
    private By password = By.name("password");      
    private By submitButton = By.xpath("//input[@value='Login']");  

    public LoginTP(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String un) {
        driver.findElement(userName).sendKeys(un);
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }
}
