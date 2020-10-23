package br.com.fiap.spring.advice.exc;

public class PreRegistrationFailedException extends RuntimeException {
    public PreRegistrationFailedException(String message) {
        super(message);
    }
}