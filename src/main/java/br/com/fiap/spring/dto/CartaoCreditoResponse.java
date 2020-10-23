package br.com.fiap.spring.dto;

import java.util.List;

public class CartaoCreditoResponse {

  private Boolean hasNext;
  private Integer pageNumber;
  private Integer totalPages;
  private List<CartaoCreditoItemResponse> cartaoCredito;

  public CartaoCreditoResponse(Boolean hasNext, Integer pageNumber, Integer totalPages,List<CartaoCreditoItemResponse> cartaoCredito){
    
    this.hasNext = hasNext;
    this.pageNumber = pageNumber;
    this.totalPages = totalPages;
    this.cartaoCredito = cartaoCredito;
  }


  public Boolean isHasNext() {
    return this.hasNext;
  }

  public Boolean getHasNext() {
    return this.hasNext;
  }

  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }

  public Integer getPageNumber() {
    return this.pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public Integer getTotalPages() {
    return this.totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public List<CartaoCreditoItemResponse> getCartaoCredito() {
    return this.cartaoCredito;
  }

  public void setCartaoCredito(List<CartaoCreditoItemResponse> cartaoCredito) {
    this.cartaoCredito = cartaoCredito;
  }

  
}
