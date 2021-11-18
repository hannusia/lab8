package sender;

import adapter.User;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        if (user.getCountry().equals(country)) {
            System.out.println("message to " + user.getEmail() + "was sent");
            return true;
        } else {
            System.out.println("message to" + user.getEmail() + "wasn't sent. try again");
            return false;
        }
    }
}