package designpatterns.adaptor;

public class Calendly {

    PlatformAdaptor platformAdaptor;
    private String link;
    public Calendly(){
        platformAdaptor = new MicrosoftTeamsAdaptor();
    }
    public String getLink(){
        return link;
    }
    public void createMeeting(){
        ConnectionStatus response = platformAdaptor.createConnectionLink();
        if(response.returnCode==1)
            link = platformAdaptor.sendConnectionLink();
        else
            link="Couldn't connect to the server";

    }
}
