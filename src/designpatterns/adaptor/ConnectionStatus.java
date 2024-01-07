package designpatterns.adaptor;

public enum ConnectionStatus {
    CONNECTION_CREATED(1), CONNECTION_CREATION_FAILED(0);
    int returnCode;
    ConnectionStatus(int returnCode) {
        this.returnCode = returnCode;
    }
}
