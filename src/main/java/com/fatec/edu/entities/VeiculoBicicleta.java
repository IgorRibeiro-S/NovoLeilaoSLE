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

public class VeiculoBicicleta extends Veiculo {
	
	private Boolean eletrica;
	private String condicao;
	private String marcha;
	public VeiculoBicicleta(Integer id, String tipo, String marca, Integer ano, String modelo, String descricao,
			Double valor, Leilao leilao, Boolean eletrica, String condicao, String marcha) {
		super(id, tipo, marca, ano, modelo, descricao, valor, leilao);
		this.eletrica = eletrica;
		this.condicao = condicao;
		this.marcha = marcha;
	}
	

	
	

}
