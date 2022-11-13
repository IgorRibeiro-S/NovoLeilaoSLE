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
public class ImovelTerreno extends Imovel {
	
	private Double metrosQuadrados;

	public ImovelTerreno(Integer id, String registro, String tipo, String endereco, String descricao, Double valor,
			 Leilao leilao, Double metrosQuadrados) {
		super(id, registro, tipo, endereco, descricao, valor, leilao);
		this.metrosQuadrados = metrosQuadrados;
	}



	
	

}
