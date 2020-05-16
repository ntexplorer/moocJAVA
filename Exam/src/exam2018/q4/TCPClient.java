package exam2018.q4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Tian Z
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 6000);
        boolean flag = true;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the operation line:");
            String line = scanner.nextLine();
            if (line.equals("stop")) {
                break;
            } else {
                OutputStream out = socket.getOutputStream();
                out.write(line.getBytes());

                InputStream in = socket.getInputStream();
                byte[] data = new byte[1024];
                int len = in.read(data);
                System.out.println(new String(data, 0, len));
            }
        }

        socket.close();
    }
}
