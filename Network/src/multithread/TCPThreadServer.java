package multithread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Tian Z
 */
public class TCPThreadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8000);
        while (true) {
            Socket socket = server.accept();
            new Thread(new Upload(socket)).start();
        }
    }
}
