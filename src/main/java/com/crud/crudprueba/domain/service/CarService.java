package com.crud.crudprueba.domain.service;

import com.crud.crudprueba.data.crud.ICarCrudRepository;
import com.crud.crudprueba.data.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements ICarService {

    @Autowired
    private ICarCrudRepository carRepository;


    @Override
    public List<Car> findAllCars() {
        return (List<Car>) carRepository.findAll();
    }

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car updateCar(Car car, Integer id) {
        return carRepository.save(car);
    }

    @Override
    public void deleteCarById(Integer id) {
        carRepository.deleteById(id);
    }
}
