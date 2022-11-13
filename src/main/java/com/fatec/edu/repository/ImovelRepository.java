package com.fatec.edu.repository;

import java.util.HashSet;
import java.util.Set;

import com.fatec.edu.entities.Imovel;
import com.fatec.edu.entities.ImovelApartamento;
import com.fatec.edu.entities.ImovelCasa;
import com.fatec.edu.services.ImovelService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class ImovelRepository implements ImovelService {

	private Set<Imovel> imovels = new HashSet<>();

	private String usarname;

	private ImovelCasa imovel1 = new ImovelCasa(53, "344hc", "Casa", "Rua das colméias 44", "Casa nova", 200000.00,
			null, 6, true, 125.44);

	private ImovelApartamento imovel2 = new ImovelApartamento(89, "7899ty", "Apartamento", "Rua dos tijolos",
			"Apartamento de entrada", 118000.00, null, 3, 58.12, "Simples", 5);

	@Override
	public Set<Imovel> listarImovels() {
		imovels.add(imovel1);
		imovels.add(imovel2);
		return imovels;
	}

	@Override
	public void novoImovel(Imovel imovel) {
		imovels.add(imovel);
		imovels.add(imovel1);
		imovels.add(imovel2);

	}

	@Override
	public void atualizarDados(Imovel obj, Imovel imovel) {
		obj.setDescricao(imovel.getDescricao());
		obj.setEndereco(imovel.getEndereco());
		obj.setTipo(imovel.getTipo());
		obj.setValor(imovel.getValor());

	}

	@Override
	public void removerImovel(Integer id) {
		for (Imovel imovel : listarImovels()) {
			if (imovel.getId() == id) {
				imovels.remove(imovel);
			}
		}

	}

	@Override
	public void atualizarImovel(Integer id, Imovel imovel) {
		for (Imovel obj : imovels) {
			if (obj.getId() == id) {
				obj.setDescricao(imovel.getDescricao());
				obj.setEndereco(imovel.getEndereco());
				obj.setTipo(imovel.getTipo());
				obj.setValor(imovel.getValor());
				imovels.add(imovel);
			}
		}
	}

}
