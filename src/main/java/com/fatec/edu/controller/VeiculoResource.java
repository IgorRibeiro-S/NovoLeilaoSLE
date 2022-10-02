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

import com.fatec.edu.entities.Veiculo;
import com.fatec.edu.interfaces.VeiculoService;

public class VeiculoResource extends ServerResource {

	@Autowired
	private VeiculoService veiculoService;

	@Get
	public List<Veiculo> listarImoveis() {
		List<Veiculo> lista = veiculoService.listarVeiculos();
		return lista;
	}

	@Post
	public Veiculo novoVeiculo(@RequestBody Veiculo veiculo) {
		return veiculoService.novoVeiculo(veiculo);
	}
	
	@Put(value = "/{id}")
	public Veiculo atualizarVeiculo(@PathVariable("id") Long id, @RequestBody Veiculo obj) {
		obj.setId(id);
		return veiculoService.atualizarVeiculo(obj);
	}
	
	@Delete(value = "/{id}")
	public void excluirVeiculo(@PathVariable("id") Long id) {
		veiculoService.removerVeiculo(id);
	}
	
}
