package br.com.fiap.spring.dto;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class PagamentoRequest {

  @NotNull
  private Integer idPagamento;

  @NotNull
  private BigDecimal totalPedido;

  @NotNull
  private String registroEstudante;

  @Valid
  @NotNull
  private CartaoCreditoRequest cartaoCredito;

  public PagamentoRequest(){
  }


  public PagamentoRequest(Integer idPagamento, BigDecimal totalPedido, String registroEstudante, CartaoCreditoRequest cartaoCredito) {
    this.idPagamento = idPagamento;
    this.totalPedido = totalPedido;
    this.registroEstudante = registroEstudante;
    this.cartaoCredito = cartaoCredito;
  }


  public Integer getIdPagamento() {
    return this.idPagamento;
  }

  public void setIdPagamento(Integer idPagamento) {
    this.idPagamento = idPagamento;
  }

  public BigDecimal getTotalPedido() {
    return this.totalPedido;
  }

  public void setTotalPedido(BigDecimal totalPedido) {
    this.totalPedido = totalPedido;
  }

  public String getRegistroEstudante() {
    return this.registroEstudante;
  }

  public void setRegistroEstudante(String registroEstudante) {
    this.registroEstudante = registroEstudante;
  }

  public CartaoCreditoRequest getCartaoCredito() {
    return this.cartaoCredito;
  }

  public void setCartaoCredito(CartaoCreditoRequest cartaoCredito) {
    this.cartaoCredito = cartaoCredito;
  }
  
}
