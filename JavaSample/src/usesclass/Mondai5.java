package usesclass;

public class Mondai5 {

	public static void main(String[] args) {
		String ipAddress = "192.168.0.255";
		String[] ip = ipAddress.split("\\.");
		for(int i=0; i<=ip.length-1; i++) {
			System.out.println(ip[i]);
		}
	}

}
