package designpatterns.adaptor;

public class MicrosoftTeamsAdaptor implements PlatformAdaptor{

    MicrosoftTeams microsoftTeams;
    public MicrosoftTeamsAdaptor(){
        microsoftTeams = new MicrosoftTeams();
    }
    @Override
    public ConnectionStatus createConnectionLink() {
        String userName="Satya";
        String email = "satya@adaptor.com";
        String response = microsoftTeams.connection(userName,email);
        if(response.equalsIgnoreCase("created"))
            return ConnectionStatus.CONNECTION_CREATED;
        else
            return ConnectionStatus.CONNECTION_CREATION_FAILED;
    }

    @Override
    public String sendConnectionLink() {
        return MicrosoftTeams.connectionLink;
    }
}
