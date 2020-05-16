package exam2019.q4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author Tian Z
 */
public class UDPSend {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the student number: ");
            String studentNum = scanner.nextLine();
            if (studentNum.equals("stop")) {
                break;
            }
            byte[] data = studentNum.getBytes();
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            DatagramPacket outPack = new DatagramPacket(data, data.length, inetAddress, 6000);
            DatagramSocket datagramSocket = new DatagramSocket();
            datagramSocket.send(outPack);
            byte[] data1 = new byte[1024];
            DatagramPacket inPack = new DatagramPacket(data1, data1.length);
            datagramSocket.receive(inPack);
            System.out.println(new String(inPack.getData(), inPack.getOffset(), inPack.getLength()));
        }

    }
}
