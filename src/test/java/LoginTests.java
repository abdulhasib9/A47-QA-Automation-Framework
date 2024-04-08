// LoginTests.java

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testSuccessfulLogin() {
        loginPage.enterUsername("abdul.hasib.yousufzai@testpro.io");
        loginPage.enterPassword("test12345");
        loginPage.clickLoginButton();
        // Assertion for successful login
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
