package PageObjects;

import Drivers.TestContext;
import org.openqa.selenium.WebDriver;

public class PageBase {


    private WebDriver driver;
    private TestContext testContext;
    private String pageUrl;

    public PageBase(TestContext testContext)
    {
        this.driver = testContext.getDriver();
        this.testContext = testContext;
    }

    public void navigateToHere(){
        driver.get(testContext.getBaseUrl() + getPageUrl());
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

}
