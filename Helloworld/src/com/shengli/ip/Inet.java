package com.shengli.ip;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class Inet {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws UnknownHostException, MalformedURLException {
		/*
		InetAddress ia = InetAddress.getLocalHost();
		System.out.println(ia.getHostName());
		System.out.println(ia.getHostAddress());
		ia = InetAddress.getByName("www.163.com");
		System.out.println(ia.getHostAddress());
		System.out.println(ia.getHostName());
		*/
		/*
		InetSocketAddress isa = new InetSocketAddress("127.0.0.1", 9999);
		System.out.println(isa.getHostName());
		System.out.println(isa.getPort());
		InetAddress ia = isa.getAddress();
		*/
		URL url = new URL("http://www.baidu.com:80/a/index.html");
		url = new URL("http://www.baidu.com:80/a/");
		url = new URL(url, "b/index.html");
		System.out.println(url.toString());
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getProtocol());
		System.out.println(url.getFile());
		System.out.println(url.getPath());
		

	}

}




