package com.hr_app.hr_app_backend.payload.response;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ApiResponse<T> {

    private String status;
    private HttpStatus code;
    private String message;
    private LocalDateTime timeStamp;
    private T data;

    public ApiResponse(String status, HttpStatus code, String message, LocalDateTime timeStamp, T data) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.timeStamp = timeStamp;
        this.data = data;
    }

    public ApiResponse() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HttpStatus getCode() {
        return code;
    }

    public void setCode(HttpStatus code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
