package Practice10.Client;

import java.io.IOException;

public class ClientMain {
    public static void main(String[] args) {
        boolean connected = false;
        while(!connected){
            try{
                ConnectInputMessage connectWithServer = new ConnectInputMessage();
                Thread tConnectInputMessage = new Thread(connectWithServer);
                tConnectInputMessage.start();

                Thread tReceiveMessage = new Thread(
                        new ReceiveMessageFromServer(
                                connectWithServer.getClientInputStream(),
                                connectWithServer.getClientNumber()
                        )
                );
                tReceiveMessage.start();

                connected = true;
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {
                }
            }
        }
    }
}
