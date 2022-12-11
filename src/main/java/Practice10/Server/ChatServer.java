package Practice10.Server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Map;
import java.util.TreeMap;

public class ChatServer implements Runnable{
    private final Map<Integer, Socket> mapClient;
    private int numClients;

    public ChatServer(){
        mapClient = new TreeMap<Integer, Socket>();
        numClients = 0;
    }

    @Override
    public void run() {
        try(ServerSocket server = new ServerSocket(8987)){
            System.out.println("Server is running. Waiting for clients");

            Socket client = null;
            while(true){
                 client = server.accept();

                Thread clientThread = new Thread(new ClientThread(client, this, numClients));
                clientThread.setDaemon(true);
                clientThread.start();

                mapClient.put(numClients++, client);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendMessageForAllClients(int clientNumber, String message){
        for(Integer clientN: mapClient.keySet()){
            if(clientN == clientNumber){
                continue;
            }

            PrintWriter pw = null;
            try{
                pw = new PrintWriter(mapClient.get(clientN).getOutputStream(), true);
                pw.println(message);
            } catch (IOException e) {
                System.err.println("Error while writing to Client №" + clientN);
                clearClient(clientN);
            }
        }
    }

    public void clearClient(int key){
        try{
            System.out.println("Disconnecting Client №" + key);

            Socket client = mapClient.remove(key);
            client.close();

            System.out.println("Client №" + key + " disconnected");
            sendMessageForAllClients(key, "Client №" + key + " disconnected");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
