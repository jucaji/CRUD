package com.crud.crudprueba.data.crud;


import com.crud.crudprueba.data.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserCrudRepository extends CrudRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.document = ?1032")
    List<User> findAllUserByDocumentEqualsOrderByPassword(String document);

    User findByNameUser(String name);

    User findByDocumentUser(String document);
}
