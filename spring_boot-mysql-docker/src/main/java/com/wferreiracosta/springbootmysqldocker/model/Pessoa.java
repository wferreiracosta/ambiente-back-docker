package com.wferreiracosta.springbootmysqldocker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "cd_pessoa")
  private Long id;

  @Column(name = "nome")
  private String nome;

  @Column(name = "sobrenome")
  private String sobrenome;

  public Pessoa() {
  }

  public Pessoa(Long id, String nome, String sobrenome) {
    this.id = id;
    this.nome = nome;
    this.sobrenome = sobrenome;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

}
