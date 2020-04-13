package DataModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class UserData {

    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("username")
    @Expose
    private String username;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void generateRandomuserDetails(){
        LocalDateTime ldt = LocalDateTime.now();
        String now = DateTimeFormatter.ofPattern("yyyyMMddHHmmss", Locale.ENGLISH).format(ldt);

        setUsername("user_" + now);
        setEmail("email_"+now+"@testermail.com");
        setPassword("Password");
    }
}
