package PageObjects;

import Drivers.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {

    private WebDriver driver;
    public HomePage(TestContext testContext) {
        super(testContext);
        this.driver = testContext.getDriver();
    }

    public boolean usernameLinkExists(String username) throws InterruptedException {
        Thread.sleep(5000); // to be replaced with real sync
        WebElement userLink = driver.findElement(By.xpath("//a[contains(@href,'"+ username +"')]"));
        return userLink.isDisplayed();
    }
}
