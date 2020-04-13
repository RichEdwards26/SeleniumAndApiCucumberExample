package Steps;

import Drivers.TestContext;
import PageObjects.HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomeSteps {

    private TestContext testContext;
    private HomePage home;
    public HomeSteps(TestContext testContext, HomePage home){
        this.testContext = testContext;
        this.home = home;
    }

    @Then("a new account is logged in")
    public void a_new_account_is_logged_in() throws InterruptedException {
        String username = "user_";// register.getUser().getUsername();

        Assert.assertTrue("Username Exists on Home",
                home.usernameLinkExists(username) );
    }
}
