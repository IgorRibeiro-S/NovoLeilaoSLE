package com.fatec.edu.controller;

import java.util.Set;

import com.fatec.edu.entities.Financeira;
import com.fatec.edu.repository.FinanceiraRepository;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;

public class FinanceiraResource extends ServerResource {

	public FinanceiraRepository listaFinanceira = new FinanceiraRepository();

	@Delete
	public void removerFinanceira(Integer id) {
		listaFinanceira.removerFinanceira(id);
	}

	@Put
	public void atualizarFinanceira(Integer id, Financeira financeira) {
		listaFinanceira.atualizarFinanceira(id, financeira);

	}

	public void atualizarDados(Financeira antigo, Financeira novo) {
		listaFinanceira.atualizarDados(antigo, novo);

	}

	@Post
	public void novoFinanceira(Financeira financeira) {
		listaFinanceira.novoFinanceira(financeira);

	}

	@Get
	public Set<Financeira> listarFinanceiras() {
		return listaFinanceira.listarFinanceiras();
	}

}
