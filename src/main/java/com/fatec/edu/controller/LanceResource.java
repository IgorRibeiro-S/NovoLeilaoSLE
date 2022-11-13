package com.fatec.edu.controller;

import java.util.Set;

import com.fatec.edu.entities.Lance;
import com.fatec.edu.repository.LanceRepository;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;

public class LanceResource extends ServerResource {

	public LanceRepository listaLance = new LanceRepository();

	@Delete
	public void removerLance(Integer id) {
		listaLance.removerLance(id);
	}

	@Put
	public void atualizarLance(Integer id, Lance lance) {
		listaLance.atualizarLance(id, lance);

	}

	public void atualizarDados(Lance antigo, Lance novo) {
		listaLance.atualizarDados(antigo, novo);

	}

	@Post
	public void novoLance(Lance lance) {
		listaLance.novoLance(lance);

	}

	@Get
	public Set<Lance> listarLances() {
		return listaLance.listarLances();
	}

}
