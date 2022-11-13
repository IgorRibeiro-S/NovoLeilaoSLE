package com.fatec.edu.controller;

import java.util.Set;

import com.fatec.edu.entities.Cliente;
import com.fatec.edu.repository.ClienteRepository;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;

public class ClienteResource extends ServerResource {

	public ClienteRepository listaCliente = new ClienteRepository();

	@Delete
	public void removerCliente(Integer id) {
		listaCliente.removerCliente(id);
	}

	@Put
	public void atualizarCliente(Integer id, Cliente cliente) {
		listaCliente.atualizarCliente(id, cliente);

	}

	public void atualizarDados(Cliente antigo, Cliente novo) {
		listaCliente.atualizarDados(antigo, novo);

	}

	@Post
	public void novoCliente(Cliente cliente) {
		listaCliente.novoCliente(cliente);

	}

	@Get
	public Set<Cliente> listarClientes() {
		return listaCliente.listarClientes();
	}

}
