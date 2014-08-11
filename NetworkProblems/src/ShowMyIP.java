import static java.lang.System.out;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

public class ShowMyIP {

	static void displayInterfaceInformation(NetworkInterface netint)
			throws SocketException {
		Object name = new Object();
		name = "wlp9s4";
		if (netint.getDisplayName().equals(name)) {

			Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
			for (InetAddress inetAddress : Collections.list(inetAddresses)) {
				if (inetAddress instanceof Inet4Address) {
					out.printf("InetAddress: %s\n", inetAddress);
				}
				out.printf("\n");
			}
		}
	}

	public static void main(String args[]) throws SocketException {
		Enumeration<NetworkInterface> nets = NetworkInterface
				.getNetworkInterfaces();
		for (NetworkInterface netint : Collections.list(nets)) {
			displayInterfaceInformation(netint);
		}
	}
}
