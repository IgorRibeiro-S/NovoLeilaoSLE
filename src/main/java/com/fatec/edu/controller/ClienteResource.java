package com.fatec.edu.controller;

import java.util.List;

import com.fatec.edu.entities.Cliente;
import com.fatec.edu.services.ClienteServiceImpl;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public class ClienteResource extends ServerResource {

	@Autowired
	private ClienteServiceImpl clienteService;

	@Get
	public List<Cliente> listarClientes() {
		List<Cliente> lista = clienteService.listarClientes();
		return lista;
	}

	@Post
	public Cliente novoCliente(@RequestBody Cliente cliente) {
		return clienteService.novoCliente(cliente);
	}
	
	@Put(value = "/{id}")
	public Cliente atualizarCliente(@PathVariable("id") Long id, @RequestBody Cliente obj) {
		obj.setId(id);
		return clienteService.atualizarCliente(obj);
	}
	
	@Delete(value = "/{id}")
	public void excluirCliente(@PathVariable("id") Long id) {
		clienteService.removerCliente(id);
	}
	
}
