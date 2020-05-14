package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Tian Z
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket service = new ServerSocket(8888);
        Socket socket = service.accept();
        InputStream in = socket.getInputStream();
        byte[] data = new byte[1024];
        int len = in.read(data);
        System.out.println(new String(data, 0, len));

        OutputStream out = socket.getOutputStream();
        out.write("Got it, thx!".getBytes());

        socket.close();
        service.close();
    }
}
