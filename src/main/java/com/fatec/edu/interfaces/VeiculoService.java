package com.fatec.edu.interfaces;

import java.util.List;

import com.fatec.edu.entities.Veiculo;

public interface VeiculoService {
	
	public Veiculo novoVeiculo(Veiculo imovel);
	public List<Veiculo> listarVeiculos();
	public Veiculo buscarVeiculoId(Long id);
	public void removerVeiculo(Long id);
	public Veiculo atualizarVeiculo(Veiculo imovel);
	public void atualizarDados(Veiculo antigo, Veiculo novo);
}
