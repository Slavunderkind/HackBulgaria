import static java.lang.System.out;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class AllAvailableHosts {

	public static void main(String[] args) throws SocketException {
		Enumeration<NetworkInterface> nets = NetworkInterface
				.getNetworkInterfaces();
		for (NetworkInterface netint : Collections.list(nets)) {
			showMe(netint);
		}
	}

	static void showMe(NetworkInterface netint) {
		Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
		for (int i = 0; i < 256; i++) {
			out.printf("/192.168.1.", i);

		}

		// out.printf("InetAddress: %s\n", inetAddress);
	}

	ArrayList<String> myList = new ArrayList<String>();
}
