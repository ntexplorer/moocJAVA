package exam2020.q4;

/**
 * @author Tian Z
 */
public class NetworkMonitor {
    private static NetworkMonitor networkMonitor;

    private NetworkMonitor() {
    }

    public static NetworkMonitor getInstance() {
        if (networkMonitor == null) {
            networkMonitor = new NetworkMonitor();
        }
        return networkMonitor;
    }
}
