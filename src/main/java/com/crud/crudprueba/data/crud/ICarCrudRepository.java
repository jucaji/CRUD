package com.crud.crudprueba.data.crud;

import com.crud.crudprueba.data.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarCrudRepository extends CrudRepository<Car, Integer> {
}
