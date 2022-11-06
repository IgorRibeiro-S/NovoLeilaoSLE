package com.fatec.edu.application;

import org.restlet.Component;
import org.restlet.data.Protocol;

public class Server {
	public static void main(String[] args) throws Exception {
		
		
		//Cliente cli1 = new Cliente(1L, "23423423", "Douglas", "12312312", "123123", "shdua@gmail.com");
		
		
		Component component = new Component();
		component.getServers().add(Protocol.HTTP, 8080);
		component.getDefaultHost().attach("/api", new ServerApp());
		
		component.start();
	}
}