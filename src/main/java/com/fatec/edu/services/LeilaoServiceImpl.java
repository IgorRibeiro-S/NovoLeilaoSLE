package com.fatec.edu.services;

import java.util.List;

import com.fatec.edu.entities.Leilao;
import com.fatec.edu.interfaces.LeilaoService;
import com.fatec.edu.repository.LeilaoRepository;

public class LeilaoServiceImpl implements LeilaoService {
	
	private LeilaoRepository leilaoRepo;

	public Leilao novoLeilao(Leilao leilao) {
		Leilao obj = leilaoRepo.save(leilao);
		return obj;
	}

	public Leilao buscarLeilaoId(Long id) {
		Leilao obj = leilaoRepo.findById(id);
		return obj;
	}

	public void removerLeilao(Long id) {
		buscarLeilaoId(id);
		leilaoRepo.deleteById(id);
	}

	public Leilao atualizarLeilao(Leilao obj) {
		Leilao novoLeilao = buscarLeilaoId(obj.getId());
		atualizarDados(novoLeilao, obj);
		return leilaoRepo.save(novoLeilao);

	}

	public void atualizarDados(Leilao antigo, Leilao novo) {
		antigo.setCidade(novo.getCidade());
		antigo.setDataLeilao(novo.getDataLeilao());
		antigo.setEndereco(novo.getEndereco());
		antigo.setEstado(novo.getEstado());

	}

	public List<Leilao> listarLeiloes() {
		return leilaoRepo.findAll();
	}

}
