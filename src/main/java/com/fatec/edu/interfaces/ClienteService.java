package com.fatec.edu.interfaces;

import java.util.List;

import com.fatec.edu.entities.Cliente;

public interface ClienteService {
	
	public Cliente novoCliente(Cliente cliente);
	public List<Cliente> listarClientes();
	public Cliente buscarClienteId(Long id);
	public void removerCliente(Long id);
	public Cliente atualizarCliente(Cliente cliente);
	public void atualizarDados(Cliente antigo, Cliente novo);
}
