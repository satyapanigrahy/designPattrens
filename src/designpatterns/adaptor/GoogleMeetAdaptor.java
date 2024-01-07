package designpatterns.adaptor;

public class GoogleMeetAdaptor implements PlatformAdaptor{

    GoogleMeet googleMeet;

    public GoogleMeetAdaptor(){
        googleMeet = new GoogleMeet();
    }
    @Override
    public ConnectionStatus createConnectionLink() {
        //logic for connection creation
        System.out.println("Google Meet Connection created!");
        boolean response = googleMeet.createConnection();
        if(response)
            return ConnectionStatus.CONNECTION_CREATED;
        else
            return ConnectionStatus.CONNECTION_CREATION_FAILED;
    }

    @Override
    public String sendConnectionLink() {
        return googleMeet.sendConnectionLink();
    }
}
