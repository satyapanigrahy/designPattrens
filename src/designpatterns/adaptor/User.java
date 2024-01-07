package designpatterns.adaptor;

public class User {
    public static void main(String[] args) {
        Calendly calendly= new Calendly();
        calendly.createMeeting();
        String link = calendly.getLink();
        System.out.println(link);
    }
}
