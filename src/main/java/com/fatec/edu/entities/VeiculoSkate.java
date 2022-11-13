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

public class VeiculoSkate extends Veiculo {

	private Boolean eletrico;
	private String condicao;
	private Double peso;
	
	public VeiculoSkate(Integer id, String tipo, String marca, Integer ano, String modelo, String descricao, Double valor,
			 Leilao leilao, Boolean eletrico, String condicao, Double peso) {
		super(id, tipo, marca, ano, modelo, descricao, valor, leilao);
		this.eletrico = eletrico;
		this.condicao = condicao;
		this.peso = peso;
	}



}
