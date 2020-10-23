package br.com.fiap.spring.advice.exc;

public class CartaoCreditoConflictException extends RuntimeException {
  public CartaoCreditoConflictException(String message){
    super(message);
  }
}
