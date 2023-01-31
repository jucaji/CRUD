package com.crud.crudprueba.domain.service.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id, Throwable cause) {
        super("User with id="+id+ " not found", cause);
    }
}
