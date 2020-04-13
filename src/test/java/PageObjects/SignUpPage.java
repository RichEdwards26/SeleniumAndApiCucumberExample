package PageObjects;

import Drivers.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends PageBase {

    private WebDriver driver;

    public SignUpPage(TestContext testContext) {
        super(testContext);
        this.driver= testContext.getDriver();
        setPageUrl("register");
    }

    private By usernameField = By.xpath("//input[@placeholder='Username']");
    private By passwordField = By.xpath("//input[@placeholder='Password']");
    private By emailField = By.xpath("//input[@placeholder='Email']");
    private By signUpButton = By.xpath("//button[text()='Sign up']");

    public void CompleteSignUpForm(String username,String  email, String password){
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(signUpButton).click();
    }
}
