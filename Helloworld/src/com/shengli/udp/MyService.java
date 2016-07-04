package com.shengli.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class MyService {

	public static void main(String[] args) throws IOException {
		DatagramSocket service = new DatagramSocket(8888);
		byte [] b = new byte[1024];
		DatagramPacket dp = new DatagramPacket(b, b.length);
		service.receive(dp);
		byte [] data = dp.getData();
		int len = dp.getLength();
		System.out.println(new String(data, 0, len));
		System.out.println(new String(data, 0, data.length));
		service.close();
	}

}
