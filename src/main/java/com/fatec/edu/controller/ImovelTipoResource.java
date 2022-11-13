package com.fatec.edu.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fatec.edu.entities.Imovel;
import com.fatec.edu.entities.ImovelApartamento;
import com.fatec.edu.entities.ImovelCasa;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class ImovelTipoResource extends ServerResource {
	private Set<Imovel> imovels = new HashSet<>();

	private ImovelCasa imovel1 = new ImovelCasa(53, "344hc", "Casa", "Rua das colméias 44", "Casa nova", 200000.00,
			null, 6, true, 125.44);

	private ImovelApartamento imovel2 = new ImovelApartamento(89, "7899ty", "Apartamento", "Rua dos tijolos",
			"Apartamento de entrada", 118000.00, null, 3, 58.12, "Simples", 5);

	@Get
	public List<Imovel> findAllByTipo() {
		List<Imovel> listaTipo = new ArrayList<>();
		imovels.add(imovel1);
		imovels.add(imovel2);
		for (Imovel imovel : imovels) {
			if (imovel.getTipo().toUpperCase().contains("CASA")) {
				listaTipo.add(imovel);
			}
		}
		return listaTipo;
	}
}
