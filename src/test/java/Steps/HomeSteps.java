package Steps;

import DataModels.Register;
import Drivers.TestContext;
import PageObjects.HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomeSteps {

    private TestContext testContext;
    private HomePage home;
    private Register register;
    public HomeSteps(TestContext testContext, HomePage home, Register register){
        this.testContext = testContext;
        this.home = home;
        this.register = register;
    }

    @Then("a new account is logged in")
    public void a_new_account_is_logged_in() throws InterruptedException {
        String username = register.getUser().getUsername();

        Assert.assertTrue("Username Exists on Home",
                home.usernameLinkExists(username) );
    }
}
