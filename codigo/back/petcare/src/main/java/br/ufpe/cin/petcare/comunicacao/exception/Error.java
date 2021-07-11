package br.ufpe.cin.petcare.comunicacao.exception;

import org.springframework.http.HttpStatus;

public class Error {
    private final HttpStatus httpStatus;
    private final String message;

    public Error(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }

    public String getMessage() {
        return this.message;
    }
}
