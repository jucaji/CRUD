package com.crud.crudprueba.repository;

import com.crud.crudprueba.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, Integer> {
    User findByNameUser(String name);

    User findByDocumentUser(String document);
}
