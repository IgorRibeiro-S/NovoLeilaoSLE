package com.fatec.edu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fatec.edu.entities.Imovel;
import com.fatec.edu.interfaces.ImovelService;
import com.fatec.edu.repository.ImovelRepository;

public class ImovelServiceImpl implements ImovelService {

	@Autowired
	private ImovelRepository imovelRepo;
	
	public Imovel novoImovel(Imovel imovel) {
		Imovel obj = imovelRepo.save(imovel);
		return obj;
	}

	public List<Imovel> listarImoevis() {
		return imovelRepo.findAll();
	}

	public Imovel buscarImovelId(Long id) {
		Optional<Imovel> obj = imovelRepo.findById(id);
		return obj.get();
	}

	public void removerImovel(Long id) {
		buscarImovelId(id);
		imovelRepo.deleteById(id);
	}

	public Imovel atualizarImovel(Imovel obj) {
		Imovel novoImovel = buscarImovelId(obj.getId());
		atualizarDados(novoImovel, obj);
		return imovelRepo.save(novoImovel);
		
	}

	public void atualizarDados(Imovel antigo, Imovel novo) {
		antigo.setDescricao(novo.getDescricao());
		antigo.setEndereco(novo.getEndereco());
		antigo.setImovelTipo(novo.getImovelTipo());
		antigo.setRegistro(novo.getRegistro());
		
	}

}
