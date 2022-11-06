package com.fatec.edu.repository;

import java.util.ArrayList;
import java.util.List;

import com.fatec.edu.entities.Veiculo;

public class VeiculoRepository {

	public List<Veiculo> listaVeiculo = new ArrayList<>();

	public Veiculo save(Veiculo obj) {
		listaVeiculo.add(obj);
		return obj;
	}

	public Veiculo findById(Long id) {
		for (Veiculo veiculo : listaVeiculo) {
			if (veiculo.getId() == id) {
				return veiculo;
			}
		}
		return null;
	}

	public void deleteById(Long id) {
		for (Veiculo veiculo : listaVeiculo) {
			if (veiculo.getId() == id) {
				listaVeiculo.remove(veiculo);
			}
		}
	}
	
	public List<Veiculo> findAll(){
		return listaVeiculo;
	}
	
	public List<Veiculo> findAllBetweenValores(Double valor1, Double valor2){
		List<Veiculo> listaValores = new ArrayList<>();
		for(Veiculo veiculo : listaVeiculo) {
			if(veiculo.getValor() > valor1 && veiculo.getValor() < valor2) {
				listaValores.add(veiculo);
			}		
		}return listaValores;
		
	}
	

	public List<Veiculo> findAllByPalavraChave(String palavra) {
		List<Veiculo> listaPalavra = new ArrayList<>();
		for (Veiculo veiculo : listaVeiculo) {
			if (veiculo.getDescricao().contains(palavra)) {
				listaPalavra.add(veiculo);
			}
		}
		return listaPalavra;
	}

	public List<Veiculo> findAllByTipo(String tipo) {
		List<Veiculo> listaTipo = new ArrayList<>();
		for (Veiculo veiculo : listaVeiculo) {
			if (veiculo.getTipo().contains(tipo)) {
				listaTipo.add(veiculo);
			}
		}
		return listaTipo;
	}
	
	
	
	

}
