package adapter;

import lombok.Setter;
import twitter.TwitterUser;

import java.util.Date;

@Setter
public class TwitterAdapter implements User{
    private TwitterUser user;

    public TwitterAdapter(TwitterUser twiUser) {
        this.user = twiUser;
    }

    public String getEmail(){
        return user.getUserMail();
    }

    public String getCountry(){
        return user.getCountry();
    }

    public Date getDate() {
        return user.getLastActiveTime();
    }
}