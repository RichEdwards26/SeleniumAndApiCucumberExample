package DataModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Register {
    @SerializedName("user")
    @Expose
    private UserData userData;

    public UserData getUser() {
        return userData;
    }
    public void setUser(UserData userData) {
        this.userData = userData;
    }

    public Register() {
        userData = new UserData();
    }
}