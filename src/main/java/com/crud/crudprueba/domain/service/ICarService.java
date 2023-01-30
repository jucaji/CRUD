package com.crud.crudprueba.domain.service;

import com.crud.crudprueba.data.entity.UberX;

import java.util.List;

public interface ICarService {

    List<UberX> findAllUberX();
    UberX findUberXById(Integer id);
    UberX saveUberX(UberX uberX);
    UberX updateUberX(UberX uberX, Integer id);
    void deleteUberX(UberX uberX);
    void deleteUberXById(Integer id);
}
