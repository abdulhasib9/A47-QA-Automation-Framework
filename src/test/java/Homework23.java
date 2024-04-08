//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import java.time.Duration;
//
//public class Homework23 extends BaseTest {
//    private WebDriver driver;
//
//    @BeforeMethod
//    public void setup() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        String url = "https://qa.koel.app/";
//        driver.get(url);
//    }
//
//    @Test
//    public void renamePlaylist() {
//        LoginPage loginPage = new LoginPage(driver);
//        HomePage homePage = loginPage.login("abdul.hasib.yousufzai@testpro.io", "test12345");
//        PlaylistPage playlistPage = homePage.navigateToPlaylist();
//        playlistPage.renamePlaylist("Favorite");
//        driver.quit();
//    }
//}
//
//class LoginPage {
//    @FindBy(xpath = "//input[@placeholder='Email Address']")
//    private WebElement emailInput;
//
//    @FindBy(xpath = "//input[@placeholder='Password']")
//    private WebElement passwordInput;
//
//    @FindBy(xpath = "//button[@type='submit']")
//    private WebElement submitButton;
//
//    private WebDriver driver;
//
//    public LoginPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
//
//    public HomePage login(String email, String password) {
//        emailInput.sendKeys(email);
//        passwordInput.sendKeys(password);
//        submitButton.click();
//        return new HomePage(driver);
//    }
//}
//
//class HomePage {
//    @FindBy(xpath = "//*[@id='playlists']/ul/li[3]/a")
//    private WebElement playlistElement;
//
//    private WebDriver driver;
//
//    public HomePage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
//
//    public PlaylistPage navigateToPlaylist() {
//        playlistElement.click();
//        return new PlaylistPage(driver);
//    }
//}
//
//class PlaylistPage {
//    @FindBy(xpath = "//*[@id='playlists']/ul/li[3]/a")
//    private WebElement playlistElement;
//
//    @FindBy(id = "sidebar")
//    private WebElement sideBar;
//
//    private WebDriver driver;
//
//    public PlaylistPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
//
//    public void renamePlaylist(String newName) {
//        playlistElement.click();
//        sideBar.click(); // Assuming clicking the sidebar after renaming
//    }
//}
