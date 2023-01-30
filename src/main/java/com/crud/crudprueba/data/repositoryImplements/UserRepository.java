package com.crud.crudprueba.data.repositoryImplements;

import com.crud.crudprueba.data.crud.IUserCrudRepository;
import com.crud.crudprueba.data.entity.User;

import com.crud.crudprueba.domain.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements IUserRepository {


    @Autowired
    private IUserCrudRepository userCrudRepository;


    @Override
    public User getUserById(Integer id) {
        return userCrudRepository.findById(id).orElse(null);
    }

    @Override
    public User saveUser(User user) {
        return userCrudRepository.save(user);
    }
}
