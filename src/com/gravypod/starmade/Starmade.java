package com.gravypod.starmade;

import java.net.InetSocketAddress;

public class Starmade {
	
	public static void main(String[] args) {
		StarmadeServer server = new StarmadeServer(8, new InetSocketAddress(4242));
		server.run();
	}
}
