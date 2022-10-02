package com.fatec.edu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fatec.edu.entities.Financeira;
import com.fatec.edu.interfaces.FinanceiraService;
import com.fatec.edu.repository.FinanceiraRepository;

public class FinanceiraServiceImpl implements FinanceiraService {

	@Autowired
	private FinanceiraRepository financeiraRepo;

	public Financeira novoFinanceira(Financeira financeira) {
		Financeira obj = financeiraRepo.save(financeira);
		return obj;
	}

	public Financeira buscarFinanceiraId(Long id) {
		Optional<Financeira> obj = financeiraRepo.findById(id);
		return obj.get();
	}

	public void removerFinanceira(Long id) {
		buscarFinanceiraId(id);
		financeiraRepo.deleteById(id);
	}

	public Financeira atualizarFinanceira(Financeira obj) {
		Financeira novoFinanceira = buscarFinanceiraId(obj.getId());
		atualizarDados(novoFinanceira, obj);
		return financeiraRepo.save(novoFinanceira);

	}

	public void atualizarDados(Financeira antigo, Financeira novo) {
		antigo.setAgencia(novo.getAgencia());
		antigo.setConta(novo.getConta());
		antigo.setNome(novo.getNome());

	}

	public List<Financeira> listarFinanceiras() {
		return financeiraRepo.findAll();
	}

}
