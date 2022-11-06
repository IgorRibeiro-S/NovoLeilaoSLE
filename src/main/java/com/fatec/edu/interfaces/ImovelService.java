package com.fatec.edu.interfaces;

import java.util.List;

import com.fatec.edu.entities.Imovel;

public interface ImovelService {
	
	public Imovel novoImovel(Imovel imovel);
	public List<Imovel> listarImoevis();
	public Imovel buscarImovelId(Long id);
	public void removerImovel(Long id);
	public Imovel atualizarImovel(Imovel imovel);
	public void atualizarDados(Imovel antigo, Imovel novo);
	public List<Imovel> buscarTodosEntreValores(Double valor1, Double valor2);
	public List<Imovel> buscarTodosPorPalavraChave(String palavra);
	public List<Imovel> buscarTodosPorTipo(String tipo);
}
