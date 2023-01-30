package com.crud.crudprueba.data.crud;

import com.crud.crudprueba.data.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserCrudRepository extends CrudRepository<User, Integer> {
    User findByNameUser(String name);

    User findByDocumentUser(String document);
}
