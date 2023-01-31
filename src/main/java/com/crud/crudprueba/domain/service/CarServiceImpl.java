package com.crud.crudprueba.domain.service;

import com.crud.crudprueba.data.crud.ICarCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements ICarService {

    @Autowired
    private ICarCrudRepository carRepository;



}
