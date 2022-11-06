package com.fatec.edu.repository;

import java.util.ArrayList;
import java.util.List;

import com.fatec.edu.entities.Financeira;

public class FinanceiraRepository {

	public List<Financeira> listaFinanceira = new ArrayList<>();

	public Financeira save(Financeira obj) {
		listaFinanceira.add(obj);
		return obj;
	}

	public Financeira findById(Long id) {
		for (Financeira financeira : listaFinanceira) {
			if (financeira.getId() == id) {
				return financeira;
			}
		}
		return null;
	}

	public void deleteById(Long id) {
		for (Financeira financeira : listaFinanceira) {
			if (financeira.getId() == id) {
				listaFinanceira.remove(financeira);
			}
		}
	}
	
	public List<Financeira> findAll(){
		return listaFinanceira;
	}
	
	
	
	

}
