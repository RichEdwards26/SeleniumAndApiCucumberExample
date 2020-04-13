package Steps;

import DataModels.Register;
import Drivers.TestContext;
import PageObjects.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SignUpSteps {

    private TestContext testContext;
    private SignUpPage signupPage;
    public SignUpSteps(TestContext testContext, SignUpPage signupPage)
    {
        this.testContext = testContext;
        this.signupPage = signupPage;
    }
    @Given("I am on the signup page")
    public void i_am_on_the_signup_page() {
        signupPage.navigateToHere();
    }


    @When("I complete the signup form with unique details and press submit")
    public void i_complete_the_signup_form_with_unique_details_and_press_submit() {
        Register register = new Register();
        register.getUser().generateRandomuserDetails();
        signupPage.CompleteSignUpForm(
                register.getUser().getUsername(),
                register.getUser().getEmail(),
                register.getUser().getPassword()
        );
    }

}
