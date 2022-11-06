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
public class VeiculoMotocicleta extends Veiculo {
	
	private String cor;
	private Integer anoLicenciamento;
	private String resultadoPericiaCautelar;
	private String condicaoCarenagem;
	public VeiculoMotocicleta(Long id, String tipo, String marca, Integer ano, String modelo, String descricao,
			Double valor, @NonNull Leilao leilao, String cor, Integer anoLicenciamento, String resultadoPericiaCautelar,
			String condicaoCarenagem) {
		super(id, tipo, marca, ano, modelo, descricao, valor, leilao);
		this.cor = cor;
		this.anoLicenciamento = anoLicenciamento;
		this.resultadoPericiaCautelar = resultadoPericiaCautelar;
		this.condicaoCarenagem = condicaoCarenagem;
	}
	


	
	
}
