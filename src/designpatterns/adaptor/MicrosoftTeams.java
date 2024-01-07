package designpatterns.adaptor;

import java.net.MalformedURLException;
import java.net.URL;

public class MicrosoftTeams {
    static String  connectionLink = "";
    public String connection(String userName, String email){
        try {
            connectionLink = String.valueOf(new URL("http://teams.adaptor.com?uName="+userName + Math.random() + "&mail="+email));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e+"Error in creating link");
        }
        return "created";
    }
}
