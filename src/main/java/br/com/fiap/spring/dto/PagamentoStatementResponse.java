package br.com.fiap.spring.dto;

import java.math.BigDecimal;

public class PagamentoStatementResponse {

  private Integer id;
  private Integer idPedido;
  private BigDecimal totalPedido;
  private String status;
  private String creationDate;
  private String updateDate;

  public PagamentoStatementResponse(Integer id, Integer idPedido, BigDecimal totalPedido, String status, String creationDate, String updateDate) {
    this.id = id;
    this.idPedido = idPedido;
    this.totalPedido = totalPedido;
    this.status = status;
    this.creationDate = creationDate;
    this.updateDate = updateDate;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getIdPedido() {
    return this.idPedido;
  }

  public void setIdPedido(Integer idPedido) {
    this.idPedido = idPedido;
  }

  public BigDecimal getTotalPedido() {
    return this.totalPedido;
  }

  public void setTotalPedido(BigDecimal totalPedido) {
    this.totalPedido = totalPedido;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getCreationDate() {
    return this.creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public String getUpdateDate() {
    return this.updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }
}
