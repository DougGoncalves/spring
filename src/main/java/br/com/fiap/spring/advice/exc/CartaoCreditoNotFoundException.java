package br.com.fiap.spring.advice.exc;

public class CartaoCreditoNotFoundException extends RuntimeException{
  public CartaoCreditoNotFoundException(String message){
    super(message);
  }
}
