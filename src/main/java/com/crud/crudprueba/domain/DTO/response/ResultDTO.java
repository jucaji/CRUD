package com.crud.crudprueba.domain.DTO.response;

public class ResultDTO <T> {
    
    private T data;
    private String message;
    private boolean isSuccess;

    public ResultDTO() {
        super();
    }

    public ResultDTO(T data, String message, boolean isSuccess) {
        super();
        this.data = data;
        this.message = message;
        this.isSuccess = isSuccess;
    }

    public ResultDTO(String message, boolean isSuccess) {
        super();
        this.message = message;
        this.isSuccess = isSuccess;
    }

    public ResultDTO(String tripCreatedSuccessfully) {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
}
