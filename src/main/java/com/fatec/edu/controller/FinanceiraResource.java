package com.fatec.edu.controller;

import java.util.List;

import com.fatec.edu.entities.Financeira;
import com.fatec.edu.services.FinanceiraServiceImpl;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public class FinanceiraResource extends ServerResource {

	@Autowired
	private FinanceiraServiceImpl financeiraService;

	@Get
	public List<Financeira> listarFinanceira() {
		List<Financeira> lista = financeiraService.listarFinanceiras();
		return lista;
	}

	@Post
	public Financeira novoFinanceira(@RequestBody Financeira financeira) {
		return financeiraService.novoFinanceira(financeira);
	}
	
	@Put(value = "/{id}")
	public Financeira atualizarFinanceira(@PathVariable("id") Long id, @RequestBody Financeira obj) {
		obj.setId(id);
		return financeiraService.atualizarFinanceira(obj);
	}
	
	@Delete(value = "/{id}")
	public void excluirFinanceira(@PathVariable("id") Long id) {
		financeiraService.removerFinanceira(id);
	}
	
}
