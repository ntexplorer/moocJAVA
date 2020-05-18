package exam2020.q4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

/**
 * The type Trans server.
 *
 * @author Tian Z
 */
public class TransServer {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        double sum = 0;
        ServerSocket sSock;
        try {
            sSock = new ServerSocket(8000);
            Socket socket = sSock.accept();
            while (true) {
                InputStream in = socket.getInputStream();
                byte[] data = new byte[1024];
                int len = in.read(data);
                String purchaseStr = new String(data, 0, len);
//                add a exit to the while loop, when receiving "stop" shut down the server
                if ("stop".equals(purchaseStr)) {
                    break;
                } else {
                    System.out.println("Received:");
                    System.out.println(purchaseStr);
                    String[] purchaseArr = purchaseStr.split(" ");
                    double price = Double.parseDouble(purchaseArr[0]);
                    double unitNum = Double.parseDouble(purchaseArr[1]);
                    sum += price * unitNum;
                    OutputStream out = socket.getOutputStream();
                    System.out.println("Send back:");
                    System.out.println(sum);
                    out.write(Double.toString(sum).getBytes());
                }
            }
            System.out.println("Server terminated.");
            socket.close();
            sSock.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
    }
}
