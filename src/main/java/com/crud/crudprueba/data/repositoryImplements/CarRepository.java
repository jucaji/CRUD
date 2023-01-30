package com.crud.crudprueba.data.repositoryImplements;

import com.crud.crudprueba.data.crud.ICarCrudRepository;
import com.crud.crudprueba.domain.repository.ICarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarRepository implements ICarRepository {

    @Autowired
    ICarCrudRepository carCrudRepository;
}
