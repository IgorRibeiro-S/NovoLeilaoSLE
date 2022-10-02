package com.fatec.edu.controller;

import java.util.List;

import com.fatec.edu.entities.Imovel;
import com.fatec.edu.services.ImovelServiceImpl;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public class ImovelResource extends ServerResource {

	@Autowired
	private ImovelServiceImpl imovelService;

	@Get
	public List<Imovel> listarImoveis() {
		List<Imovel> lista = imovelService.listarImoevis();
		return lista;
	}

	@Post
	public Imovel novoImovel(@RequestBody Imovel imovel) {
		return imovelService.novoImovel(imovel);
	}
	
	@Put(value = "/{id}")
	public Imovel atualizarImovel(@PathVariable("id") Long id, @RequestBody Imovel obj) {
		obj.setId(id);
		return imovelService.atualizarImovel(obj);
	}
	
	@Delete(value = "/{id}")
	public void excluirImovel(@PathVariable("id") Long id) {
		imovelService.removerImovel(id);
	}
	
}
