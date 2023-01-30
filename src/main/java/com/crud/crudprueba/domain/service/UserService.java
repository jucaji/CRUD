package com.crud.crudprueba.domain.service;

import com.crud.crudprueba.data.crud.IUserCrudRepository;
import com.crud.crudprueba.data.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements GenericService<User> {

    @Autowired
    private IUserCrudRepository userRepository;

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }
    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }
    @Override
    public User save(User object) {
        return userRepository.save(object);
    }
    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }
}
