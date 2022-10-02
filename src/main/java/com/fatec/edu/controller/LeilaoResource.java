package com.fatec.edu.controller;

import java.util.List;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.fatec.edu.entities.Leilao;
import com.fatec.edu.interfaces.LeilaoService;

public class LeilaoResource extends ServerResource {

	@Autowired
	private LeilaoService leilaoService;

	@Get
	public List<Leilao> listarLeiloes() {
		List<Leilao> lista = leilaoService.listarLeiloes();
		return lista;
	}

	@Post
	public Leilao novoLeilao(@RequestBody Leilao leilao) {
		return leilaoService.novoLeilao(leilao);
	}
	
	@Put(value = "/{id}")
	public Leilao atualizarLeilao(@PathVariable("id") Long id, @RequestBody Leilao obj) {
		obj.setId(id);
		return leilaoService.atualizarLeilao(obj);
	}
	
	@Delete(value = "/{id}")
	public void excluirLeilao(@PathVariable("id") Long id) {
		leilaoService.removerLeilao(id);
	}
	
}
