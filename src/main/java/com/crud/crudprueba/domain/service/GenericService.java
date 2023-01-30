package com.crud.crudprueba.domain.service;

import java.util.List;

public interface GenericService<T>{

    List<T> findAll();
    T findById(Integer id);
    T save(T object);
    void delete(Integer id);

}
