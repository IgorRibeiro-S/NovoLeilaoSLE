package com.fatec.edu.controller;

import java.util.Set;

import com.fatec.edu.entities.Veiculo;
import com.fatec.edu.repository.VeiculoRepository;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;

public class VeiculoResource extends ServerResource {

	public VeiculoRepository listaVeiculo = new VeiculoRepository();

	@Delete
	public void removerVeiculo(Integer id) {
		listaVeiculo.removerVeiculo(id);
	}

	@Put
	public void atualizarVeiculo(Integer id, Veiculo veiculo) {
		listaVeiculo.atualizarVeiculo(id, veiculo);

	}

	public void atualizarDados(Veiculo antigo, Veiculo novo) {
		listaVeiculo.atualizarDados(antigo, novo);

	}

	@Post
	public void novoVeiculo(Veiculo veiculo) {
		listaVeiculo.novoVeiculo(veiculo);

	}

	@Get
	public Set<Veiculo> listarVeiculos() {
		return listaVeiculo.listarVeiculos();
	}

}
