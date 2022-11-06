package com.fatec.edu.services;

import java.util.List;

import com.fatec.edu.entities.Imovel;
import com.fatec.edu.interfaces.ImovelService;
import com.fatec.edu.repository.ImovelRepository;

public class ImovelServiceImpl implements ImovelService {

	private ImovelRepository imovelRepo;

	public Imovel novoImovel(Imovel imovel) {
		Imovel obj = imovelRepo.save(imovel);
		return obj;
	}

	public List<Imovel> listarImoevis() {
		return imovelRepo.findAll();
	}

	public Imovel buscarImovelId(Long id) {
		Imovel obj = imovelRepo.findById(id);
		return obj;
	}

	public void removerImovel(Long id) {
		buscarImovelId(id);
		imovelRepo.deleteById(id);
	}

	public Imovel atualizarImovel(Imovel obj) {
		Imovel novoImovel = buscarImovelId(obj.getId());
		atualizarDados(novoImovel, obj);
		return imovelRepo.save(novoImovel);

	}

	public void atualizarDados(Imovel antigo, Imovel novo) {
		antigo.setDescricao(novo.getDescricao());
		antigo.setEndereco(novo.getEndereco());
		antigo.setRegistro(novo.getRegistro());

	}

	@Override
	public List<Imovel> buscarTodosEntreValores(Double valor1, Double valor2) {
		return imovelRepo.findAllBetweenValores(valor1, valor2);
	}

	@Override
	public List<Imovel> buscarTodosPorPalavraChave(String palavra) {
		return imovelRepo.findAllByPalavraChave(palavra);
	}

	@Override
	public List<Imovel> buscarTodosPorTipo(String tipo) {
		return imovelRepo.findAllByTipo(tipo);
	}

}
