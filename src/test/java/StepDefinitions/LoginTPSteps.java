package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import Pages.LoginTP;
import utils.DriverFactory;

public class LoginTPSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginTP loginPage = new LoginTP(driver);

    @Given("the user navigates to the tp login page")
    public void openLoginPage() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
        Thread.sleep(2000);
    }

    @When("the user enters tp login username {string}")
    public void enterUsername(String username) throws InterruptedException {
        loginPage.enterUserName(username);
        Thread.sleep(2000);
    }

    @When("the user enters tp login password {string}")
    public void enterPassword(String password) throws InterruptedException {
        loginPage.enterPassword(password);
        Thread.sleep(2000);
    }

    @When("the user clicks on the tp login button")
    public void clickLogin() {
        loginPage.clickSubmit();
    }

    @Then("the user should be redirected to the tp login homepage")
    public void verifyRedirected() {

    	if (driver.getCurrentUrl().contains("home")) {
            System.out.println("Redirected to homepage successfully.");
        } else {
            System.out.println("Not redirected");
        }
    }

    @Then("a welcome message should be displayed on tp login")
    public void verifyWelcomeMessage() {
        String pageSource = driver.getPageSource();
        if (pageSource.contains("Welcome")) {
            System.out.println("Welcome message displayed.");
        } else {
            System.out.println("Welcome message not found.");
        }
    }
}

