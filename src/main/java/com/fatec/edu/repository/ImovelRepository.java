package com.fatec.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.edu.entities.Imovel;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {

}
