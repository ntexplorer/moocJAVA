package inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Tian Z
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        function();
    }

    private static void function() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress.toString());
        String ip = inetAddress.getHostAddress();
        String name = inetAddress.getHostName();
        System.out.println(ip + "  " + name);
    }
}
