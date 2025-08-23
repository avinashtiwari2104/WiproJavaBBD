package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class GuruRegistration {
    
    private WebDriver driver;

    private By firstName = By.name("firstName");
    private By lastName = By.name("lastName");
    private By phone = By.name("phone");
    private By email = By.name("userName");
    private By address = By.name("address1");
    private By city = By.name("city");
    private By state = By.name("state");
    private By postalCode = By.name("postalCode");
    private By country = By.name("country");
    private By userName = By.name("email");
    private By password = By.name("password");
    private By confirmPassword = By.name("confirmPassword");
    private By submitButton = By.name("submit");

    // Constructor
    public GuruRegistration(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterFirstName(String fn) {
        driver.findElement(firstName).sendKeys(fn);
    }

    public void enterLastName(String ln) {
        driver.findElement(lastName).sendKeys(ln);
    }

    public void enterPhone(String ph) {
        driver.findElement(phone).sendKeys(ph);
    }

    public void enterEmail(String em) {
        driver.findElement(email).sendKeys(em);
    }

    public void enterAddress(String addr) {
        driver.findElement(address).sendKeys(addr);
    }

    public void enterCity(String cty) {
        driver.findElement(city).sendKeys(cty);
    }

    public void enterState(String st) {
        driver.findElement(state).sendKeys(st);
    }

    public void enterPostalCode(String zip) {
        driver.findElement(postalCode).sendKeys(zip);
    }

    public void selectCountry(String cntry) {
        Select sel = new Select(driver.findElement(country));
        sel.selectByVisibleText(cntry);
    }

    public void enterUserName(String uname) {
        driver.findElement(userName).sendKeys(uname);
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void enterConfirmPassword(String cpwd) {
        driver.findElement(confirmPassword).sendKeys(cpwd);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }
}
