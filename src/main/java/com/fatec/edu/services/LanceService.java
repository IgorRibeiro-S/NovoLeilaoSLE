package com.fatec.edu.services;

import java.util.Set;

import com.fatec.edu.entities.Lance;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;

public interface LanceService {
	
	@Post
	public void novoLance(Lance obj);
	
	@Get
	public Set<Lance> listarLances();
	
	
	@Delete
	public void removerLance(Integer id);
	
	@Put
	public void atualizarLance(Integer id, Lance obj);
	
	public void atualizarDados(Lance antigo, Lance novo);
}
