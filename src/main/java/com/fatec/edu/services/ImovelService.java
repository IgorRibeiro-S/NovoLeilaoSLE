package com.fatec.edu.services;

import java.util.Set;

import com.fatec.edu.entities.Imovel;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;

public interface ImovelService {
	@Post
	public void novoImovel(Imovel obj);
	
	@Get
	public Set<Imovel> listarImovels();
	
	
	@Delete
	public void removerImovel(Integer id);
	
	@Put
	public void atualizarImovel(Integer id, Imovel obj);
	
	public void atualizarDados(Imovel antigo, Imovel novo);
}
