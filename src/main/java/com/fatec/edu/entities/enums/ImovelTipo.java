package com.fatec.edu.entities.enums;

public enum ImovelTipo {
	APARTAMENTOS("Apartamento"), 
	TERRENOS("Terreno"), 
	CASAS("Casa"), 
	EDIFICIOS_COMERCIAIS("Edifício Comercial");

	private final String valor;

	ImovelTipo(String valor){
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
}
