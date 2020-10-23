package br.com.fiap.spring.dto;

import javax.validation.constraints.NotNull;

import br.com.fiap.spring.annotations.CardValidator.CardValidation;

public class CartaoRequest {

  @CardValidation
  @NotNull
  private String numeroCartao;

  @NotNull
  private Integer verificador;

  public CartaoRequest() { 
  }

  public CartaoRequest(String numeroCartao, Integer verificador) {
    this.numeroCartao = numeroCartao;
    this.verificador = verificador;
  }

  public String getNumeroCartao() {
    return this.numeroCartao;
  }

  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  public Integer getVerificador() {
    return this.verificador;
  }

  public void setVerificador(Integer verificador) {
    this.verificador = verificador;
  }
}
