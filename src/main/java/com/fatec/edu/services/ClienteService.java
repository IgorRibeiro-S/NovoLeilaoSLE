package com.fatec.edu.services;

import java.util.Set;

import com.fatec.edu.entities.Cliente;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;

public interface ClienteService {
	
	@Post
	public void novoCliente(Cliente cliente);
	
	@Get
	public Set<Cliente> listarClientes();
	
	
	@Delete
	public void removerCliente(Integer id);
	
	@Put
	public void atualizarCliente(Integer id, Cliente cliente);
	
	public void atualizarDados(Cliente antigo, Cliente novo);
}
