package com.fatec.edu.controller;

import java.util.Set;

import com.fatec.edu.entities.Leilao;
import com.fatec.edu.repository.LeilaoRepository;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;

public class LeilaoResource extends ServerResource {

	public LeilaoRepository listaLeilao = new LeilaoRepository();

	@Delete
	public void removerLeilao(Integer id) {
		listaLeilao.removerLeilao(id);
	}

	@Put
	public void atualizarLeilao(Integer id, Leilao leilao) {
		listaLeilao.atualizarLeilao(id, leilao);

	}

	public void atualizarDados(Leilao antigo, Leilao novo) {
		listaLeilao.atualizarDados(antigo, novo);

	}

	@Post
	public void novoLeilao(Leilao leilao) {
		listaLeilao.novoLeilao(leilao);

	}

	@Get
	public Set<Leilao> listarLeilaos() {
		return listaLeilao.listarLeilaos();
	}

}
