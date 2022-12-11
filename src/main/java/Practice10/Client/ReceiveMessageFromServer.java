package Practice10.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReceiveMessageFromServer implements Runnable{
    private InputStream inputStreamServer;
    private int clientNumber;

    public ReceiveMessageFromServer(InputStream inputStreamServer, int clientNumber) {
        this.inputStreamServer = inputStreamServer;
        this.clientNumber = clientNumber;
    }

    @Override
    public void run() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(inputStreamServer))){
            String message;
            while(true){
                message = br.readLine();

                if(message != null){
                    System.out.print("\r");
                    System.out.println(message);
                    System.out.printf(ConnectInputMessage.FINPUT_MESSAGE, clientNumber);
                }
            }
        } catch (IOException e) {
            System.err.println("Socket is closed");
        }
    }
}
