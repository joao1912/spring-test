package com.projeto.java_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.java_spring.model.Profissao;

public interface ProfissaoRepository extends JpaRepository<Profissao, Integer> {}