package br.com.fiap.spring.dto;

import javax.validation.constraints.NotNull;

import br.com.fiap.spring.annotations.CardValidator.CardValidation;

public class CartaoCreditoRequest {

  @NotNull
  private String registro;

  @NotNull
  private String nome;

  @NotNull
  private String curso;

  @CardValidation
  @NotNull
  private String numeroCartao;

  @NotNull
  private String dataValidade;

  @NotNull
  private String verificador;

  public CartaoCreditoRequest(){ 
  }


  public CartaoCreditoRequest(String registro, String nome, String curso, String numeroCartao, String dataValidade, String verificador) {
    this.registro = registro;
    this.nome = nome;
    this.curso = curso;
    this.numeroCartao = numeroCartao;
    this.dataValidade = dataValidade;
    this.verificador = verificador;
  }


  public String getRegistro() {
    return this.registro;
  }

  public void setRegistro(String registro) {
    this.registro = registro;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCurso() {
    return this.curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public String getNumeroCartao() {
    return this.numeroCartao;
  }

  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  public String getDataValidade() {
    return this.dataValidade;
  }

  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  public String getVerificador() {
    return this.verificador;
  }

  public void setVerificador(String verificador) {
    this.verificador = verificador;
  }
}
