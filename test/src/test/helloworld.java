package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public final class helloworld {
	public static void main(String[] args) throws UnknownHostException {
		System.out.println("hello world");
//		InetAddress ip = InetAddress.getLocalHost();
//		System.out.println(ip.getHostName());
		System.out.println("hi");
		System.out.println(System.getProperty("name1"));
	}
}
