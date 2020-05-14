package imagetransmit;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Tian Z
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8000);
        System.out.println("Listening to port 8000...");
        Socket socket = server.accept();
        System.out.println("Connection established...");

        InputStream in = socket.getInputStream();
        File upload = new File("Network/src/imagetransmit/upload");
        if (!upload.exists()) {
            upload.mkdirs();
        }
        String fileName = "new_test.jpg";
        FileOutputStream fos = new FileOutputStream(upload + File.separator + fileName);

        byte[] bytes = new byte[1024];
        int len = 0;
        System.out.println("Transmitting image...");
        while ((len = in.read()) != -1) {
            fos.write(bytes, 0, len);
        }
        System.out.println("Transmission complete!");
        socket.getOutputStream().write("Upload successful!".getBytes());
        fos.close();
        socket.close();
        server.close();
    }
}
