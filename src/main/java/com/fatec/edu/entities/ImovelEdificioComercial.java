package com.fatec.edu.entities;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ImovelEdificioComercial extends Imovel {

	private Integer andares;
	private Double metrosQuadradosPorAndar;
	private Boolean elevador;
	private Boolean mezanino;
	
	public ImovelEdificioComercial(Long id, String registro, String tipo, String endereco, String descricao,
			Double valor, @NonNull Leilao leilao, Integer andares, Double metrosQuadradosPorAndar, Boolean elevador,
			Boolean mezanino) {
		super(id, registro, tipo, endereco, descricao, valor, leilao);
		this.andares = andares;
		this.metrosQuadradosPorAndar = metrosQuadradosPorAndar;
		this.elevador = elevador;
		this.mezanino = mezanino;
	}




}
