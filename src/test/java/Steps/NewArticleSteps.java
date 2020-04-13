package Steps;

import DataModels.ValidatedUser;
import Drivers.TestContext;
import io.cucumber.java.en.When;

public class NewArticleSteps {

    private TestContext testContext;
    private ValidatedUser validatedUser;
    public NewArticleSteps(TestContext testContext, ValidatedUser validatedUser){
        this.testContext = testContext;
        this.validatedUser = validatedUser;
    }
    @When("I post an article")
    public void i_post_an_article() {

        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
