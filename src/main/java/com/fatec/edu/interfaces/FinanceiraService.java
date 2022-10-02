package com.fatec.edu.interfaces;

import java.util.List;

import com.fatec.edu.entities.Financeira;

public interface FinanceiraService {
	
	public Financeira novoFinanceira(Financeira financeira);
	public List<Financeira> listarFinanceiras();
	public Financeira buscarFinanceiraId(Long id);
	public void removerFinanceira(Long id);
	public Financeira atualizarFinanceira(Financeira financeira);
	public void atualizarDados(Financeira antigo, Financeira novo);
}
