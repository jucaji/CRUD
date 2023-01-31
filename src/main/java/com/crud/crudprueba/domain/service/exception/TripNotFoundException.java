package com.crud.crudprueba.domain.service.exception;

public class TripNotFoundException extends RuntimeException{
    public TripNotFoundException(Integer id, Throwable cause) {
        super("Trip with id="+id+ " not found", cause);
    }
}
