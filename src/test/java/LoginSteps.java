import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginSteps {
    WebDriver driver;

    @Given("User navigates to the login page")
    public void navigateToLoginPage() {
        // Initialize WebDriver and navigate to the login page

        driver = new ChromeDriver();
        String url = "https://qa.koel.app/";
        driver.get(url);
    }

    @When("User enters valid username and password")
    public void enterCredentials() {

        driver.findElement(By.id("username")).sendKeys("abdul.hasib.yousufzai@testpro.io");
        driver.findElement(By.id("password")).sendKeys("test12345");
    }

    @When("User clicks on the login button")
    public void clickLoginButton() {

        driver.findElement(By.id("loginButton")).click();
    }

    @Then("User should be logged in successfully")
    public void verifyLoginSuccess() {

        boolean loggedIn = driver.findElement(By.id("dashboard")).isDisplayed();
        Assert.assertTrue(loggedIn, "Login was not successful");
    }

    @After
    public void closeBrowser() {

        driver.quit();
    }
}
