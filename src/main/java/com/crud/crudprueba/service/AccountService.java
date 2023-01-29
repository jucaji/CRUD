package com.crud.crudprueba.service;

import com.crud.crudprueba.entity.Driver;
import com.crud.crudprueba.entity.User;
import com.crud.crudprueba.repository.IDriverRepository;
import com.crud.crudprueba.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountServiceImpl{

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IDriverRepository driverRepository;

    @Override
    public List<Driver> findAllDrivers() {
        return (List<Driver>) driverRepository.findAll();
    }

    @Override
    public Driver findDriverById(Integer id) {
        return driverRepository.findById(id).orElse(null);
    }

    @Override
    public Driver findDriverName(String name) {
        return driverRepository.findByNameDriver(name);
    }

    @Override
    public Driver findDriverDocument(String document) {
        return driverRepository.findByDocumentDriver(document);
    }

    @Override
    public Driver saveDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public Driver updateDriver(Driver driver, Integer id) {
        driver.setDocument(driver.getDocument());
        driver.setName(driver.getName());
        driver.setEmail(driver.getEmail());
        driver.setPassword(driver.getPassword());
        return driverRepository.save(driver);
    }

    @Override
    public void deleteDriver(Driver driver) {
        driverRepository.delete(driver);
    }

    @Override
    public void deleteDriverById(Integer id) {
        driverRepository.deleteById(id);

    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User findUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User findUserName(String name) {
        return userRepository.findByNameUser(name);
    }

    @Override
    public User findUserDocument(String document) {
        return userRepository.findByDocumentUser(document);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user, Integer id) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }
}
