package com.nomso.spotcode.advice;

import com.nomso.spotcode.exceptions.NomsoException;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author ajao temitayo
 */
@RestControllerAdvice
public class GeneralControllerAdvice {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NomsoException.class)
    private ErrorResponse handlesNomso(){
        return new ErrorResponse("Nomso happened");
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ErrorResponse handleUnexpectedExceptions(Exception ex){
        return new ErrorResponse("An unexpected error has occurred. Please contact the admin");
    }

    class ErrorResponse {
        private String message;

        public ErrorResponse(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
