package com.fatec.edu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fatec.edu.entities.Veiculo;
import com.fatec.edu.interfaces.VeiculoService;
import com.fatec.edu.repository.VeiculoRepository;

public class VeiculoServiceImpl implements VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepo;

	public Veiculo novoVeiculo(Veiculo veiculo) {
		Veiculo obj = veiculoRepo.save(veiculo);
		return obj;
	}

	public List<Veiculo> listarImoevis() {
		return veiculoRepo.findAll();
	}

	public Veiculo buscarVeiculoId(Long id) {
		Optional<Veiculo> obj = veiculoRepo.findById(id);
		return obj.get();
	}

	public void removerVeiculo(Long id) {
		buscarVeiculoId(id);
		veiculoRepo.deleteById(id);
	}

	public Veiculo atualizarVeiculo(Veiculo obj) {
		Veiculo novoVeiculo = buscarVeiculoId(obj.getId());
		atualizarDados(novoVeiculo, obj);
		return veiculoRepo.save(novoVeiculo);

	}

	public void atualizarDados(Veiculo antigo, Veiculo novo) {
		antigo.setDescricao(novo.getDescricao());
		antigo.setVeiculoTipo(novo.getVeiculoTipo());

	}

	public List<Veiculo> listarVeiculos() {

		return veiculoRepo.findAll();
	}

}
