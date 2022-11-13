package com.fatec.edu.services;

import java.util.Set;

import com.fatec.edu.entities.Leilao;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;

public interface LeilaoService {
	@Post
	public void novoLeilao(Leilao obj);
	
	@Get
	public Set<Leilao> listarLeilaos();
	
	
	@Delete
	public void removerLeilao(Integer id);
	
	@Put
	public void atualizarLeilao(Integer id, Leilao obj);
	
	public void atualizarDados(Leilao antigo, Leilao novo);
}
