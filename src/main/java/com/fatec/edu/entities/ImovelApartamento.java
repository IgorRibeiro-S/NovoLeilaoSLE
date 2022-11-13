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

public class ImovelApartamento extends Imovel {

	private Integer totalComodos;
	private Double metrosQuadrados;
	private String sacada;
	private Integer andar;

	public ImovelApartamento(Integer id, String registro, String tipo, String endereco, String descricao, Double valor,
			 Leilao leilao, Integer totalComodos, Double metrosQuadrados, String sacada, Integer andar) {
		super(id, registro, tipo, endereco, descricao, valor, leilao);
		this.totalComodos = totalComodos;
		this.metrosQuadrados = metrosQuadrados;
		this.sacada = sacada;
		this.andar = andar;
	}

}
