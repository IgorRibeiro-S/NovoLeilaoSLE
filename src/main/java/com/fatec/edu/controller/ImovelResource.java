package com.fatec.edu.controller;

import java.util.Set;

import com.fatec.edu.entities.Imovel;
import com.fatec.edu.repository.ImovelRepository;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;

public class ImovelResource extends ServerResource {

	public ImovelRepository listaImovel = new ImovelRepository();

	@Delete
	public void removerImovel(Integer id) {
		listaImovel.removerImovel(id);
	}

	@Put
	public void atualizarImovel(Integer id, Imovel imovel) {
		listaImovel.atualizarImovel(id, imovel);

	}

	public void atualizarDados(Imovel antigo, Imovel novo) {
		listaImovel.atualizarDados(antigo, novo);

	}

	@Post
	public void novoImovel(Imovel imovel) {
		listaImovel.novoImovel(imovel);

	}

	@Get
	public Set<Imovel> listarImovels() {
		return listaImovel.listarImovels();
	}

}
