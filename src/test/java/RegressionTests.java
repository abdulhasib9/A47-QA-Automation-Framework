// RegressionTests.java

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegressionTests {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testFailedLogin() {
        loginPage.enterUsername("invaliduser");
        loginPage.enterPassword("invalidpassword");
        loginPage.clickLoginButton();
        // Assertion for failed login
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
