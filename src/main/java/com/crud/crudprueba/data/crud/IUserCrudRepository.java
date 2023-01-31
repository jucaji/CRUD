package com.crud.crudprueba.data.crud;


import com.crud.crudprueba.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserCrudRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.document = :document")
    List<User> findUserSpecific(@Param("document") String document);

}
