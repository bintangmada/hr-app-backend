package com.hr_app.hr_app_backend.payload.response;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ApiResponse<T> {

    private String status;
    private int code;
    private String message;
    private String timeStamp;
    private T data;

    public ApiResponse(String status, int code, String message, String timeStamp, T data) {
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
