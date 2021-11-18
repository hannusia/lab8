package adapter;

import facebook.FacebookUser;
import lombok.Setter;

import java.util.Date;

@Setter
public class FacebookAdapter implements User{
    private FacebookUser user;

    public FacebookAdapter(FacebookUser fbUser) {
        this.user = fbUser;
    }

    public String getEmail(){
        return user.getEmail();
    }

    public String getCountry(){
        return user.getUserCountry();
    }

    public Date getDate() {
        return user.getUserActiveTime();
    }
}