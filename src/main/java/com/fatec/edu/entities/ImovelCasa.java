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

public class ImovelCasa extends Imovel {

	private Integer totalComodos;
	private Boolean quintal;
	private Double metrosQuadrados;

	public ImovelCasa(Integer id, String registro, String tipo, String endereco, String descricao, Double valor,
		 Leilao leilao, Integer totalComodos, Boolean quintal, Double metrosQuadrados) {
		super(id, registro, tipo, endereco, descricao, valor, leilao);
		this.totalComodos = totalComodos;
		this.quintal = quintal;
		this.metrosQuadrados = metrosQuadrados;
	}

}
