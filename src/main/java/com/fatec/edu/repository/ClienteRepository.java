package com.fatec.edu.repository;

import java.util.HashSet;
import java.util.Set;

import com.fatec.edu.entities.Cliente;
import com.fatec.edu.services.ClienteService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class ClienteRepository implements ClienteService {
	private Set<Cliente> clientes = new HashSet<>();

	Cliente cli1 = new Cliente(12, "123456", "Jorge", "1231234", "123124", "jorge@gmail.com");
	Cliente cli2 = new Cliente(13, "123456", "Cleiton", "12344", "454545", "cleiton@gmail.com");

	@Override
	public Set<Cliente> listarClientes() {
		clientes.add(cli1);
		clientes.add(cli2);
		return clientes;
	}

	@Override
	public void novoCliente(Cliente cliente) {
		clientes.add(cliente);
		clientes.add(cli1);
		clientes.add(cli2);

	}

	@Override
	public void removerCliente(Integer id) {
		for (Cliente cliente : listarClientes()) {
			if (cliente.getId() == id) {
				clientes.remove(cliente);
			}
		}

	}

	@Override
	public void atualizarCliente(Integer id, Cliente cliente) {
		for (Cliente cli : clientes) {
			if (cli.getId() == id) {
				cli.setCep(cliente.getCep());
				cli.setCpf(cliente.getCpf());
				clientes.add(cliente);
			}
		}

	}

	@Override
	public void atualizarDados(Cliente antigo, Cliente novo) {
		antigo.setCep(novo.getCep());
		antigo.setCpf(novo.getCpf());
		antigo.setCep(novo.getCep());
		antigo.setEmail(novo.getEmail());
		antigo.setNome(novo.getNome());
		antigo.setTelefone(novo.getTelefone());

	}
}
