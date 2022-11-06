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
public class VeiculoCarro extends Veiculo {

	private Boolean tetoSolar;
	private String cor;
	private Integer anoLicenciamento;
	private String resultadoPericiaCautelar;
	public VeiculoCarro(Long id, String tipo, String marca, Integer ano, String modelo, String descricao, Double valor,
			@NonNull Leilao leilao, Boolean tetoSolar, String cor, Integer anoLicenciamento,
			String resultadoPericiaCautelar) {
		super(id, tipo, marca, ano, modelo, descricao, valor, leilao);
		this.tetoSolar = tetoSolar;
		this.cor = cor;
		this.anoLicenciamento = anoLicenciamento;
		this.resultadoPericiaCautelar = resultadoPericiaCautelar;
	}
 
	

}
