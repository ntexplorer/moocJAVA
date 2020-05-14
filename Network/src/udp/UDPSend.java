package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Tian Z
 */
public class UDPSend {
    public static void main(String[] args) throws IOException {
        byte[] date = "Hello UDP".getBytes();
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        DatagramPacket datagramPacket = new DatagramPacket(date, date.length, inetAddress, 6000);
        DatagramSocket datagramSocket = new DatagramSocket();
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
