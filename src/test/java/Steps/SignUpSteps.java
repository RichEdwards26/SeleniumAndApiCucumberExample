package Steps;

import API.SignUpApi;
import DataModels.Register;
import DataModels.ValidatedUser;
import Drivers.TestContext;
import PageObjects.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.ro.Si;

import java.io.IOException;

public class SignUpSteps {

    private TestContext testContext;
    private SignUpPage signupPage;
    private Register register;
    private SignUpApi signUpApi;
    private ValidatedUser validatedUser;
    public SignUpSteps(TestContext testContext, SignUpPage signupPage, Register register,
                       SignUpApi signupApi, ValidatedUser validatedUser)
    {
        this.testContext = testContext;
        this.signupPage = signupPage;
        this.register = register;
        this.signUpApi = signupApi;
        this.validatedUser = validatedUser;
    }
    @Given("I am on the signup page")
    public void i_am_on_the_signup_page() {
        signupPage.navigateToHere();
    }


    @When("I complete the signup form with unique details and press submit")
    public void i_complete_the_signup_form_with_unique_details_and_press_submit() {
        //Register register = new Register();
        register.getUser().generateRandomuserDetails();
        signupPage.CompleteSignUpForm(
                register.getUser().getUsername(),
                register.getUser().getEmail(),
                register.getUser().getPassword()
        );
    }

    @Given("I am a new user and I create a new account")
    public void i_am_a_new_user_and_I_create_a_new_account() {
        //create a new user from random data
        register.getUser().generateRandomuserDetails();
        //API request create new user and store the data
        validatedUser = signUpApi.SignUp(register);
    }
}
