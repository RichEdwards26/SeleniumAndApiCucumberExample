package DataModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Register {
    @SerializedName("user")
    @Expose
    private RegisterUserData registerUserData;

    public RegisterUserData getUser() {
        return registerUserData;
    }
    public void setUser(RegisterUserData registerUserData) {
        this.registerUserData = registerUserData;
    }

    public Register() {
        registerUserData = new RegisterUserData();
    }
}