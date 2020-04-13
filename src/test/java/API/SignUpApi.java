package API;

import DataModels.Register;
import DataModels.ValidatedUser;
import Drivers.TestContext;
import com.google.gson.Gson;

public class SignUpApi {

    private TestContext testContext;
    private ValidatedUser validatedUser;
    public SignUpApi(TestContext testContext, ValidatedUser validatedUser)
    {
        this.testContext = testContext;
        this.validatedUser = validatedUser;
    }


    public ValidatedUser SignUp(Register register) {
        register.getUser().generateRandomuserDetails();
        Gson gson = new Gson();
        ApiHelper api = new ApiHelper();
        api.createPostRequest(gson.toJson(register), "https://conduit.productionready.io/api/users");

        String response = api.executePost();
        ValidatedUser validatedUser = new ValidatedUser();
        validatedUser = gson.fromJson(response, new ValidatedUser().getClass());

        testContext.setApiToken(validatedUser.getUser().getToken());
        return validatedUser;
    }
}
