package com.fatec.edu.repository;

import java.util.ArrayList;
import java.util.List;

import com.fatec.edu.entities.Cliente;

public class ClienteRepository {

	public List<Cliente> listaCliente = new ArrayList<>();
	
	public Cliente save(Cliente obj) {
		listaCliente.add(obj);
		return obj;
	}

	public Cliente findById(Long id) {
		for (Cliente cliente : listaCliente) {
			if (cliente.getId() == id) {
				return cliente;
			}
		}
		return null;
	}

	public void deleteById(Long id) {
		for (Cliente cliente : listaCliente) {
			if (cliente.getId() == id) {
				listaCliente.remove(cliente);
			}
		}
	}
	
	public List<Cliente> findAll(){
		return listaCliente;
	}
	
	
	
	

}
