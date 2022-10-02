package com.fatec.edu.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fatec.edu.entities.Cliente;

import org.restlet.Component;
import org.restlet.data.Protocol;

public class Server {
	public static void main(String[] args) throws Exception {
		
		Cliente cli1 = new Cliente(1L, "23423423", "Douglas", "12312312", "123123", "shdua@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(cli1);
		em.getTransaction().commit();
		
		
		Component component = new Component();
		component.getServers().add(Protocol.HTTP, 8080);
		component.getDefaultHost().attach("/api", new ServerApp());
		
		component.start();
	}
}