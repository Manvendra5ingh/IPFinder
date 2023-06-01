import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPFinder {
    public static void main(String[] args) {
        String hostName = "www.example.com"; // Replace with the desired host name

        try {
            InetAddress address = InetAddress.getByName(hostName);
            String ipAddress = address.getHostAddress();

            System.out.println("IP Address: " + ipAddress);
        } catch (UnknownHostException e) {
            System.out.println("Unable to find IP address for the host: " + hostName);
        }
    }
}
