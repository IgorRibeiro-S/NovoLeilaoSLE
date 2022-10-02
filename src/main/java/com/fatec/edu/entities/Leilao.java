package com.fatec.edu.entities;

import java.time.Instant;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@Entity
public class Leilao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant dataLeilao;
	private String estado;
	private String cidade;
	private String endereco;
	
	@JsonIgnore
	@OneToMany(mappedBy = "leilao")
	private List<Imovel> imoveis;

	@JsonIgnore
	@OneToMany(mappedBy = "leilao")
	private List<Veiculo> veiculos;
}