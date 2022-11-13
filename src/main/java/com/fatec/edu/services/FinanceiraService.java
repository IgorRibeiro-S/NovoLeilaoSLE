package com.fatec.edu.services;

import java.util.Set;

import com.fatec.edu.entities.Financeira;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;

public interface FinanceiraService {
	@Post
	public void novoFinanceira(Financeira obj);
	
	@Get
	public Set<Financeira> listarFinanceiras();
	
	
	@Delete
	public void removerFinanceira(Integer id);
	
	@Put
	public void atualizarFinanceira(Integer id, Financeira obj);
	
	public void atualizarDados(Financeira antigo, Financeira novo);
}
