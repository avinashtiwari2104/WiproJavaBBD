package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.RegisterTP;
import utils.DriverFactory;

public class RegisterTPSteps {
    WebDriver driver = DriverFactory.getDriver();
    RegisterTP rtp = new RegisterTP(driver);

    @Given("user is on the tp registration page")
    public void openRegistrationPage() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
        Thread.sleep(2000);
    }

    @When("the user enters firstname {string}")
    public void enterFirstName(String firstName) throws InterruptedException {
        rtp.enterFirstName(firstName);
        Thread.sleep(2000);
    }

    @When("the user enters lastname {string}")
    public void enterLastName(String lastName) throws InterruptedException {
        rtp.enterLastName(lastName);
        Thread.sleep(2000);
    }

    @When("the user enters tp username {string}")
    public void enterUsername(String username) throws InterruptedException {
        rtp.enterUserName(username);
        Thread.sleep(2000);
    }

    @When("the user enters tp password {string}")
    public void enterPassword(String password) throws InterruptedException {
        rtp.enterPassword(password);
        Thread.sleep(2000);
    }

    @When("the user clicks on register button")
    public void clickRegisterButton() {
        rtp.clickRegister();
    }

    @Then("the user should remain on registration page")
    public void verifyRemainOnPage() {
        if (driver.getCurrentUrl().contains("register")) {
            System.out.println("Registration form submitted, still on register page.");
        } else {
            System.out.println("Registration redirected, check expected behavior.");
        }
    }

    @Then("registration confirmation should be displayed")
    public void verifyConfirmation() {
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("success") || pageSource.contains("registered"), "Registration confirmation not found on the page!");
        System.out.println("Registration confirmation message found.");
    }
}
