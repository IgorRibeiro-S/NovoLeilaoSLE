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
public class ImovelApartamento extends Imovel {

	private Integer totalComodos;
	private Double metrosQuadrados;
	private String sacada;
	private Integer andar;

	public ImovelApartamento(Long id, String registro, String tipo, String endereco, String descricao, Double valor,
			@NonNull Leilao leilao, Integer totalComodos, Double metrosQuadrados, String sacada, Integer andar) {
		super(id, registro, tipo, endereco, descricao, valor, leilao);
		this.totalComodos = totalComodos;
		this.metrosQuadrados = metrosQuadrados;
		this.sacada = sacada;
		this.andar = andar;
	}

}
