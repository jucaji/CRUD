package com.crud.crudprueba.service;

import com.crud.crudprueba.entity.UberX;
import com.crud.crudprueba.repository.IUberXRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements ICarServiceImpl{

    @Autowired
    private IUberXRepository carRepository;


    @Override
    public List<UberX> findAllUberX() {
        return (List<UberX>) carRepository.findAll();
    }

    @Override
    public UberX findUberXById(Integer id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public UberX saveUberX(UberX uberX) {
        return carRepository.save(uberX);
    }

    @Override
    public UberX updateUberX(UberX uberX, Integer id) {
        return carRepository.save(uberX);
    }

    @Override
    public void deleteUberX(UberX uberX) {
        carRepository.delete(uberX);
    }

    @Override
    public void deleteUberXById(Integer id) {
        carRepository.deleteById(id);
    }
}
