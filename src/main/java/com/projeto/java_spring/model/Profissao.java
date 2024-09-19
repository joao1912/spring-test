package com.projeto.java_spring.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table()
public class Profissao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfissao;
    private String nome;

    @OneToMany(mappedBy = "profissao")
    @JsonIgnore
    private List<Cliente> clientes;

    public Profissao() {}

    public Profissao(String nome) {
        this.nome = nome;
    }

    public int getIdProfissao() {
        return idProfissao;
    }

    public void setIdProfissao(int idProfissao) {
        this.idProfissao = idProfissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
