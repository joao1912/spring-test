package com.projeto.java_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.java_spring.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> { }
