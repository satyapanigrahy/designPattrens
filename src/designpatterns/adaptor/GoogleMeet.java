package designpatterns.adaptor;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.random.RandomGenerator;

public class GoogleMeet {
    String connectionLink = "";
    public boolean createConnection(){
        try {
            connectionLink = String.valueOf(new URL("http://googlemeet.adaptor.com?term=" + Math.random() + "&key="));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
    public String sendConnectionLink(){
        return connectionLink;
    }
}
