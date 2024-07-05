package com.kiet.javaDemo;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class Networking {

	public static void main(String[] args) throws MalformedURLException, UnknownHostException {
		// TODO Auto-generated method stub
		URL u=new URL("http://www.google.com");
		System.out.println("Host: "+u.getHost());
		System.out.println("Port: "+u.getPort());
		System.out.println("Protocol: "+u.getProtocol());
		
		InetAddress adress = InetAddress.getByName("www.google.com");
		System.out.println("IP Address: "+ adress.getHostAddress());
		System.out.println("Host Name: "+ adress.getHostName());
		
	}

}
