package DataModels;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ValidatedUser {

        @SerializedName("user")
        @Expose
        private ValidatedUserData user;
        public ValidatedUser(){
            user = new ValidatedUserData();
        }

        public ValidatedUserData getUser() {
            return user;
        }
        public void setUser(ValidatedUserData user) {
            this.user = user;
        }

    }
