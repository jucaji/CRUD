package com.crud.crudprueba.domain.service;

import com.crud.crudprueba.data.crud.ICarCrudRepository;
import com.crud.crudprueba.data.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements GenericService<Car>, ICarService {

    @Autowired
    private ICarCrudRepository carRepository;

    @Override
    public List<Car> findAll() {
        return (List<Car>) carRepository.findAll();
    }

    @Override
    public Car findById(Integer id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public Car save(Car object) {
        return carRepository.save(object);
    }

    @Override
    public void delete(Integer id) {
        carRepository.deleteById(id);
    }
}
