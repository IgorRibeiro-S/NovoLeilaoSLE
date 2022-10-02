package com.fatec.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.edu.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
