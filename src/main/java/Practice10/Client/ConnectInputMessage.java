package Practice10.Client;

import java.io.*;
import java.net.Socket;

public class ConnectInputMessage implements Runnable{
    public static final String FINPUT_MESSAGE = "Client №%d> ";
    private Socket clientSocket;
    private int clientNumber;
    private InputStream clientInputStream;
    StringBuilder messageBuffer;

    public ConnectInputMessage() {
        try{
            clientSocket = new Socket("localhost", 8987);
            clientInputStream = clientSocket.getInputStream();
            messageBuffer = new StringBuilder();
        } catch (IOException e) {
            throw new RuntimeException("Can't connect to server");
        }
    }

    @Override
    public void run() {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(clientInputStream));
            String message;


            while(true){
                message = br.readLine();
                if(message != null){
                    clientNumber = Integer.parseInt(message);
                    break;
                }
            }
            System.out.println("Connected");

            PrintWriter pw;
            BufferedReader brUser = new BufferedReader(new InputStreamReader(System.in));

            while(true){
                System.out.printf(FINPUT_MESSAGE, clientNumber);
                message = brUser.readLine();

                pw = new PrintWriter(clientSocket.getOutputStream(), true);
                pw.println(message);

                if(message != null && message.equals("exit"))
                {
                    clientSocket.close();
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public InputStream getClientInputStream() {
        return clientInputStream;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public StringBuilder getMessageBuffer() {
        return messageBuffer;
    }
}
