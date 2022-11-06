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
public class ImovelCasa extends Imovel {

	private Integer totalComodos;
	private Boolean quintal;
	private Double metrosQuadrados;

	public ImovelCasa(Long id, String registro, String tipo, String endereco, String descricao, Double valor,
			@NonNull Leilao leilao, Integer totalComodos, Boolean quintal, Double metrosQuadrados) {
		super(id, registro, tipo, endereco, descricao, valor, leilao);
		this.totalComodos = totalComodos;
		this.quintal = quintal;
		this.metrosQuadrados = metrosQuadrados;
	}

}
