package com.crud.crudprueba.service;

import com.crud.crudprueba.entity.UberX;

import java.util.List;

public interface ICarServiceImpl {

    List<UberX> findAllUberX();
    UberX findUberXById(Integer id);
    UberX saveUberX(UberX uberX);
    UberX updateUberX(UberX uberX, Integer id);
    void deleteUberX(UberX uberX);
    void deleteUberXById(Integer id);
}
