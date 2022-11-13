package com.fatec.edu.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
@Setter

public class ImovelEdificioComercial extends Imovel {

	private Integer andares;
	private Double metrosQuadradosPorAndar;
	private Boolean elevador;
	private Boolean mezanino;
	
	public ImovelEdificioComercial(Integer id, String registro, String tipo, String endereco, String descricao,
			Double valor,  Leilao leilao, Integer andares, Double metrosQuadradosPorAndar, Boolean elevador,
			Boolean mezanino) {
		super(id, registro, tipo, endereco, descricao, valor, leilao);
		this.andares = andares;
		this.metrosQuadradosPorAndar = metrosQuadradosPorAndar;
		this.elevador = elevador;
		this.mezanino = mezanino;
	}




}
