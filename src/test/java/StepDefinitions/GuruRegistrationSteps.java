package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

import Pages.GuruRegistration;
import utils.DriverFactory;

public class GuruRegistrationSteps {
    WebDriver driver = DriverFactory.getDriver();
    GuruRegistration rp = new GuruRegistration(driver);

    @Given("user navigates to registration page")
    public void openRegistration() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Thread.sleep(2000);
    }

    @When("user enters registration details")
    public void fillDetails(io.cucumber.datatable.DataTable data) throws InterruptedException {
        var m = data.asMaps().get(0);
        rp.enterFirstName(m.get("firstName"));
        Thread.sleep(2000);
        rp.enterLastName(m.get("lastName"));
        Thread.sleep(2000);
        rp.enterPhone(m.get("phone"));
        Thread.sleep(2000);
        rp.enterEmail(m.get("email"));
        Thread.sleep(2000);
        rp.enterAddress(m.get("address"));
        Thread.sleep(2000);
        rp.enterCity(m.get("city"));
        Thread.sleep(2000);
        rp.enterState(m.get("state"));
        Thread.sleep(2000);
        rp.enterPostalCode(m.get("postalCode"));
        Thread.sleep(2000);
        rp.selectCountry(m.get("country"));
        Thread.sleep(2000);
        rp.enterUserName(m.get("userName"));
        Thread.sleep(2000);
        rp.enterPassword(m.get("password"));
        Thread.sleep(2000);
        rp.enterConfirmPassword(m.get("confirmPassword"));
        Thread.sleep(2000);
    }

    @When("user submits the form")
    public void submit() {
        rp.clickSubmit();
    }

    @Then("registration should be successful")
    public void verifySuccess() {
    	String pageSource = driver.getPageSource();

    	if (pageSource.contains("Dear")) {
    	    System.out.println("Registration successful - success message found!");
    	} else {
    	    System.out.println("Registration not successful - success message not found!");
    	}

    }
}
