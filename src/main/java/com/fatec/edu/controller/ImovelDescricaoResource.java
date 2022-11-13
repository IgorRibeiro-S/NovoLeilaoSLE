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

public class ImovelDescricaoResource extends ServerResource  {
	private Set<Imovel> imovels = new HashSet<>();

	private ImovelCasa imovel1 = new ImovelCasa(53, "344hc", "Casa", "Rua das colméias 44", "Casa nova", 200000.00,
			null, 6, true, 125.44);

	private ImovelApartamento imovel2 = new ImovelApartamento(89, "7899ty", "Apartamento", "Rua dos tijolos",
			"Apartamento de entrada", 118000.00, null, 3, 58.12, "Simples", 5);

	@Get
	public List<Imovel> findAllByPalavraChave() {
		List<Imovel> listaPalavra = new ArrayList<>();
		
		imovels.add(imovel1);
		imovels.add(imovel2);
		for (Imovel imovel : imovels) {
			if (imovel.getDescricao().toUpperCase().contains("APARTAMENTO DE ENTRADA")) {
				listaPalavra.add(imovel);
			}
		}
		return listaPalavra;
	}
}
