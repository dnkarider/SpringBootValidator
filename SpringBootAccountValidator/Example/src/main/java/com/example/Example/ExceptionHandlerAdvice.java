package com.example.Example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> ic(InvalidCredentials e) {
        return new ResponseEntity<>("InvalidCredentials", HttpStatus.I_AM_A_TEAPOT);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> uu(UnauthorizedUser e) {
        return new ResponseEntity<>("UnauthorizedUser", HttpStatus.BAD_REQUEST);
    }
}
