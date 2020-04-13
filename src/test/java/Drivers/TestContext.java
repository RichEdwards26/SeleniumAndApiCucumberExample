package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestContext {

    //....one day.... to move to external file and load in constrcutor
    // ...one day... browser powered: public String browser = "chrome";

    private String baseUrl = "https://angularjs.realworld.io/#/";
    private WebDriver driver;

    public TestContext(){
        //do any import settings from a external source
        //CreateWebDriver();
        String x = "123";
    }

    public void CreateWebDriver()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        setDriver(new ChromeDriver());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    public void CloseAndQuitWebDriver() {
        driver.close();
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public String getBaseUrl() {
        return baseUrl;
    }
    private void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
