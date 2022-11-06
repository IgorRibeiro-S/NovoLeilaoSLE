package com.fatec.edu.services;

import java.util.List;

import com.fatec.edu.entities.Veiculo;
import com.fatec.edu.interfaces.VeiculoService;
import com.fatec.edu.repository.VeiculoRepository;

public class VeiculoServiceImpl implements VeiculoService {

	private VeiculoRepository veiculoRepo;

	public Veiculo novoVeiculo(Veiculo veiculo) {
		Veiculo obj = veiculoRepo.save(veiculo);
		return obj;
	}

	public List<Veiculo> listarImoevis() {
		return veiculoRepo.findAll();
	}

	public Veiculo buscarVeiculoId(Long id) {
		Veiculo obj = veiculoRepo.findById(id);
		return obj;
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

	}

	public List<Veiculo> listarVeiculos() {

		return veiculoRepo.findAll();
	}

	@Override
	public List<Veiculo> buscarTodosEntreValores(Double valor1, Double valor2) {
		return veiculoRepo.findAllBetweenValores(valor1, valor2);
	}

	@Override
	public List<Veiculo> buscarTodosPorPalavraChave(String palavra) {
		return veiculoRepo.findAllByPalavraChave(palavra);
	}

	@Override
	public List<Veiculo> buscarTodosPorTipo(String tipo) {
		return veiculoRepo.findAllByTipo(tipo);
	}

}
