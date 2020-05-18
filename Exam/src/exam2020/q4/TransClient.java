package exam2020.q4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * The type Trans client.
 *
 * @author Tian Z
 */
public class TransClient {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8000);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the price and unit number:" +
                    "\n (Enter \"stop\" to exit.)");
            String line = scanner.nextLine();
//            If user entered "stop" then send it to the server then shut down the client
            if ("stop".equals(line)) {
                OutputStream out = socket.getOutputStream();
                out.write(line.getBytes());
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
        System.out.println("Client closed.");
        socket.close();
    }
}
