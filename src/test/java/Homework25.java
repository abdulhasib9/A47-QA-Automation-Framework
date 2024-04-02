import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class Homework25{
    public static WebDriver getRemoteDriver(String browser, String version, String platform) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", browser);
        capabilities.setCapability("version", version);
        capabilities.setCapability("platform", platform);

        String username = "yousufzai.abdulhasib";
        String accessKey = "yhD7G7acyEtEKYiM9at8mrQk3fEcodk3YecYZeZMZEDB7k2v67";

        WebDriver driver = new RemoteWebDriver(new URL("https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub"), capabilities);
        return driver;
    }
}
