package exam2019.q4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

/**
 * @author Tian Z
 */
public class MarkServer {
    private static final String[] IDs = {"c1111", "c1112", "c1113", "c1114"};
    private static final int[] marks = {99, 88, 77, 66};

    public static void main(String[] args) throws IOException {
        server(IDs, marks);
    }

    public static void server(String[] IDs, int[] marks) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(6000);
        byte[] data = new byte[1024];
        DatagramPacket inPack = new DatagramPacket(data, data.length);
        boolean flag = true;
        do {
            datagramSocket.receive(inPack);
            String studentNum = new String(inPack.getData(), inPack.getOffset(), inPack.getLength());
            System.out.println(studentNum);
            if ("stop".equals(studentNum)) {
                flag = false;
            }
            String returnStr = null;
            if (Arrays.asList(IDs).contains(studentNum)) {
                for (int i = 0; i < IDs.length; i++) {
                    if (studentNum.equals(IDs[i])) {
                        returnStr = Integer.toString(marks[i]);
                    }
                }
            } else {
                returnStr = "N/A";
            }
            assert returnStr != null;
            System.out.println(returnStr);
            byte[] returnData = returnStr.getBytes();
            DatagramPacket outPack = new DatagramPacket(returnData, returnData.length, inPack.getSocketAddress());
            datagramSocket.send(outPack);
        } while (flag);


    }
}
