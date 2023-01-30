package com.crud.crudprueba.domain.repository;

import com.crud.crudprueba.data.entity.User;


public interface IUserRepository {


    User getUserById(Integer id);

    User saveUser(User user);
}
