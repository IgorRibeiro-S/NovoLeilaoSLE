package com.fatec.edu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fatec.edu.entities.Cliente;
import com.fatec.edu.interfaces.ClienteService;
import com.fatec.edu.repository.ClienteRepository;

public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepo;

	public Cliente novoCliente(Cliente cliente) {
		Cliente obj = clienteRepo.save(cliente);
		return obj;
	}

	public Cliente buscarClienteId(Long id) {
		Optional<Cliente> obj = clienteRepo.findById(id);
		return obj.get();
	}

	public void removerCliente(Long id) {
		buscarClienteId(id);
		clienteRepo.deleteById(id);
	}

	public Cliente atualizarCliente(Cliente obj) {
		Cliente novoCliente = buscarClienteId(obj.getId());
		atualizarDados(novoCliente, obj);
		return clienteRepo.save(novoCliente);

	}

	public void atualizarDados(Cliente antigo, Cliente novo) {
		antigo.setCep(novo.getCep());
		antigo.setCpf(novo.getCpf());
		antigo.setCep(novo.getCep());
		antigo.setEmail(novo.getEmail());
		antigo.setNome(novo.getNome());
		antigo.setTelefone(novo.getTelefone());

	}

	public List<Cliente> listarClientes() {
		return clienteRepo.findAll();
	}

}
