package com.fatec.edu.repository;

import java.util.ArrayList;
import java.util.List;

import com.fatec.edu.entities.Imovel;

public class ImovelRepository {

	public List<Imovel> listaImovel = new ArrayList<>();

	public Imovel save(Imovel obj) {
		listaImovel.add(obj);
		return obj;
	}

	public Imovel findById(Long id) {
		for (Imovel imovel : listaImovel) {
			if (imovel.getId() == id) {
				return imovel;
			}
		}
		return null;
	}

	public void deleteById(Long id) {
		for (Imovel imovel : listaImovel) {
			if (imovel.getId() == id) {
				listaImovel.remove(imovel);
			}
		}
	}

	public List<Imovel> findAll() {
		return listaImovel;
	}

	public List<Imovel> findAllBetweenValores(Double valor1, Double valor2) {
		List<Imovel> listaValores = new ArrayList<>();
		for (Imovel imovel : listaImovel) {
			if (imovel.getValor() > valor1 && imovel.getValor() < valor2) {
				listaValores.add(imovel);
			}
		}
		return listaValores;

	}

	public List<Imovel> findAllByPalavraChave(String palavra) {
		List<Imovel> listaPalavra = new ArrayList<>();
		for (Imovel imovel : listaImovel) {
			if (imovel.getDescricao().contains(palavra)) {
				listaPalavra.add(imovel);
			}
		}
		return listaPalavra;
	}

	public List<Imovel> findAllByTipo(String tipo) {
		List<Imovel> listaTipo = new ArrayList<>();
		for (Imovel imovel : listaImovel) {
			if (imovel.getTipo().contains(tipo)) {
				listaTipo.add(imovel);
			}
		}
		return listaTipo;
	}

}
