package com.fatec.edu.services;

import java.util.Set;

import com.fatec.edu.entities.Veiculo;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;

public interface VeiculoService {
	@Post
	public void novoVeiculo(Veiculo obj);
	
	@Get
	public Set<Veiculo> listarVeiculos();
	
	
	@Delete
	public void removerVeiculo(Integer id);
	
	@Put
	public void atualizarVeiculo(Integer id, Veiculo obj);
	
	public void atualizarDados(Veiculo antigo, Veiculo novo);
}
