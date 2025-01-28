package com.hr_app.hr_app_backend.exception;

import org.springframework.http.HttpStatus;

public class HrAppAPIException extends RuntimeException{

    HttpStatus httpStatus;
    String message;

    public HrAppAPIException(HttpStatus httpStatus, String message){
        super(message);
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
