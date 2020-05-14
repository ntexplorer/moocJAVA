package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author Tian Z
 */
public class UDPReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(6000);
        byte[] data = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length);
        datagramSocket.receive(datagramPacket);

        String ip = datagramPacket.getAddress().getHostAddress();

        int port = datagramPacket.getPort();

        int length = datagramPacket.getLength();

        System.out.println(ip + " " + port + " : " + new String(data, 0, length));
        datagramSocket.close();
    }
}
