package com.fatec.edu.repository;

import java.util.ArrayList;
import java.util.List;

import com.fatec.edu.entities.Leilao;

public class LeilaoRepository {

	public List<Leilao> listaLeilao = new ArrayList<>();

	public Leilao save(Leilao obj) {
		listaLeilao.add(obj);
		return obj;
	}

	public Leilao findById(Long id) {
		for (Leilao leilao : listaLeilao) {
			if (leilao.getId() == id) {
				return leilao;
			}
		}
		return null;
	}

	public void deleteById(Long id) {
		for (Leilao leilao : listaLeilao) {
			if (leilao.getId() == id) {
				listaLeilao.remove(leilao);
			}
		}
	}

	public List<Leilao> findAll() {
		return listaLeilao;
	}

}
