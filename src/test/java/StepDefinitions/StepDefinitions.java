package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.LoginPage;
import io.cucumber.java.en.*;
import utils.DriverFactory;

public class StepDefinitions {

	WebDriver driver = DriverFactory.getDriver();
	LoginPage lp = new LoginPage(driver);

    @Given("User is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }

    @When("User enters {string} and {string}")
    public void user_enters_credentials(String username, String password) throws InterruptedException {
        
    	lp.enterCredentials(username, password);
    	
    	/*WebElement user = driver.findElement(By.name("username"));
        user.clear();
        user.sendKeys(username);
        Thread.sleep(1000);

        WebElement pass = driver.findElement(By.name("password"));
        pass.clear();
        pass.sendKeys(password);
        Thread.sleep(1000);*/
    }
    
    @When("User enters credentials")
	public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
 
		List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> user : users) {

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
 
			String username = user.get("username");
			String password = user.get("password");
			
			Thread.sleep(2000);
			WebElement username1 = driver.findElement(By.name("username"));
			username1.sendKeys(username);
			Thread.sleep(2000);
 
			WebElement password1 = driver.findElement(By.name("password"));
			password1.sendKeys(password);
			Thread.sleep(2000);
 
		}
	}

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() throws InterruptedException {
        lp.clickLogin();
    }
    
    @Then("User is navigated to home page")
    public void user_is_naqvigated_to_home_page() {
    	
    	String expectedResult = "Home Page";
    	
    	if (expectedResult.equalsIgnoreCase("Home Page")) {
            WebElement admin = driver.findElement(By.xpath("//li[1]//a[1]//span[1]"));
            if (admin.isDisplayed()) {
                System.out.println("Login successful: User is on Home Page");
            } else {
                System.out.println("Login failed: Home Page not found");
            }
        } else {
            WebElement errorMsg = driver.findElement(By.xpath("//p[contains(@class,'oxd-alert-content-text')]"));
            if (errorMsg.isDisplayed()) {
                System.out.println("Error displayed: " + errorMsg.getText());
            } else {
                System.out.println("Expected error not displayed");
            }
        }
    }

    /*@Then("User should see {string}")
    public void user_should_see(String expectedResult) {
        if (expectedResult.equalsIgnoreCase("Home Page")) {
            WebElement admin = driver.findElement(By.xpath("//li[1]//a[1]//span[1]"));
            if (admin.isDisplayed()) {
                System.out.println("Login successful: User is on Home Page");
            } else {
                System.out.println("Login failed: Home Page not found");
            }
        } else {
            WebElement errorMsg = driver.findElement(By.xpath("//p[contains(@class,'oxd-alert-content-text')]"));
            if (errorMsg.isDisplayed()) {
                System.out.println("Error displayed: " + errorMsg.getText());
            } else {
                System.out.println("Expected error not displayed");
            }
        }
    }*/
}
