package com.crud.crudprueba.service;

import com.crud.crudprueba.entity.Driver;
import com.crud.crudprueba.entity.User;
import com.crud.crudprueba.repository.IDriverRepository;
import com.crud.crudprueba.repository.IUserRepository;

import java.util.List;

public interface IAccountServiceImpl {

    List<Driver> findAllDrivers();
    Driver findDriverById(Integer id);
    Driver findDriverName(String name);
    Driver findDriverDocument(String document);
    Driver saveDriver(Driver driver);
    Driver updateDriver(Driver driver, Integer id);
    void deleteDriver(Driver driver);
    void deleteDriverById(Integer id);
    List<User> findAllUsers();
    User findUserById(Integer id);
    User findUserName(String name);
    User findUserDocument(String document);
    User saveUser(User user);
    User updateUser(User user, Integer id);
    void deleteUser(User user);
    void deleteUserById(Integer id);

}
