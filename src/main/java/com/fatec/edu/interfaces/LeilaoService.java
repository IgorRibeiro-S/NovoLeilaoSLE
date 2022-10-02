package com.fatec.edu.interfaces;

import java.util.List;

import com.fatec.edu.entities.Leilao;

public interface LeilaoService {
	
	public Leilao novoLeilao(Leilao leilao);
	public List<Leilao> listarLeiloes();
	public Leilao buscarLeilaoId(Long id);
	public void removerLeilao(Long id);
	public Leilao atualizarLeilao(Leilao leilao);
	public void atualizarDados(Leilao antigo, Leilao novo);
}
