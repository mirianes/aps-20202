package br.ufpe.cin.petcare.comunicacao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ApplicationExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> handleException(Exception e) {
        Error error = new Error(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());

        return new ResponseEntity<>(error, error.getHttpStatus());
    }
}
