package com.crud.crudprueba.data.crud;

import com.crud.crudprueba.data.entity.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ICarCrudRepository extends CrudRepository<Car, Integer> {

    @Query("SELECT c FROM Car c WHERE c.passengers = ?4")
    List<Car> findAll();
}
