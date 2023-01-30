package com.crud.crudprueba.domain.service;

import com.crud.crudprueba.data.entity.Car;

import java.util.List;

public interface ICarService {

    List<Car> findAllCars();
    Car saveCar(Car car);
    Car updateCar(Car car, Integer id);
    void deleteCarById(Integer id);
}
