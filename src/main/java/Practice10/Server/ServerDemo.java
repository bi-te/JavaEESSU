package Practice10.Server;

public class ServerDemo {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        Thread tCharServer = new Thread(chatServer);
        tCharServer.start();
    }
}
