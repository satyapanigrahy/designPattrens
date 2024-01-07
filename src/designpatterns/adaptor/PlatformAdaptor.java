package designpatterns.adaptor;

public interface PlatformAdaptor {
    
    ConnectionStatus createConnectionLink();

    String sendConnectionLink();
}
