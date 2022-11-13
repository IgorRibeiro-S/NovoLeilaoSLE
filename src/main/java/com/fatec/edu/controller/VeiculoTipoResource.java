package com.fatec.edu.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fatec.edu.entities.Veiculo;
import com.fatec.edu.entities.VeiculoCarro;
import com.fatec.edu.entities.VeiculoSkate;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class VeiculoTipoResource extends ServerResource {
	private Set<Veiculo> veiculos = new HashSet<>();

	private VeiculoSkate veiculo1 = new VeiculoSkate(44, "Skate", "Bilabong", 2009, null, "Skate de qualidade", 50.00,
			null, false, "Novo", 5.55);

	private VeiculoCarro veiculo2 = new VeiculoCarro(19, "Carro", "Nissan", 2012, "Versa", "Carro Semi novo", 48000.00,
			null, true, "Prata",2021, "APROVADO");

	@Get
	public List<Veiculo> findAllByTipo() {
		List<Veiculo> listaTipo = new ArrayList<>();
		veiculos.add(veiculo1);
		veiculos.add(veiculo2);
		for (Veiculo veiculo : veiculos) {
			if (veiculo.getTipo().toUpperCase().contains("CARRO")) {
				listaTipo.add(veiculo);
			}
		}
		return listaTipo;
	}
}
