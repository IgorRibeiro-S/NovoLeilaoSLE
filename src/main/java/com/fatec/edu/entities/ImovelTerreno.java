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
public class ImovelTerreno extends Imovel {
	
	private Double metrosQuadrados;

	public ImovelTerreno(Long id, String registro, String tipo, String endereco, String descricao, Double valor,
			@NonNull Leilao leilao, Double metrosQuadrados) {
		super(id, registro, tipo, endereco, descricao, valor, leilao);
		this.metrosQuadrados = metrosQuadrados;
	}



	
	

}
