package com.fatec.edu.entities.enums;

public enum VeiculoTipo {
	CARROS("Carro"), 
	MOTOCICLETAS("Motocicleta"), 
	BICICLETA("Bicicleta"), 
	PATINETE("Patinete"), 
	SKATE("Skate");

	private final String valor;
	VeiculoTipo(String valor){
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
}
