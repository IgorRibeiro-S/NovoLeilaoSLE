package com.fatec.edu.repository;

import java.util.HashSet;
import java.util.Set;

import com.fatec.edu.entities.Financeira;
import com.fatec.edu.services.FinanceiraService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class FinanceiraRepository implements FinanceiraService {
	private Set<Financeira> financeiras = new HashSet<>();

	

	Financeira cli1 = new Financeira(1, "123124124", "Banco Itau", "itau", "1400ac", null);
	Financeira cli2 = new Financeira(2, "766767", "Banco Bradesco", "Bradesco", "BR34345", null);

	@Override
	public Set<Financeira> listarFinanceiras() {
		financeiras.add(cli1);
		financeiras.add(cli2);
		return financeiras;
	}

	@Override
	public void novoFinanceira(Financeira financeira) {
		financeiras.add(financeira);
		financeiras.add(cli1);
		financeiras.add(cli2);

	}

	@Override
	public void atualizarDados(Financeira antigo, Financeira novo) {
		antigo.setNome(novo.getNome());

	}

	@Override
	public void removerFinanceira(Integer id) {
		for (Financeira financeira : listarFinanceiras()) {
			if (financeira.getId() == id) {
				financeiras.remove(financeira);
			}
		}

	}

	@Override
	public void atualizarFinanceira(Integer id, Financeira financeira) {
		for (Financeira obj : financeiras) {
			if (obj.getId() == id) {
				obj.setNome(financeira.getNome());
				financeiras.add(financeira);
			}
		}
	}
}
