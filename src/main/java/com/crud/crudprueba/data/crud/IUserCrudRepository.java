package com.crud.crudprueba.data.crud;


import com.crud.crudprueba.data.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserCrudRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> findUsersWithNameLike(@Param("name") String name);

    @Query("SELECT u FROM User u WHERE u.age BETWEEN 15 AND 21")
    List<User> findUsersAgeInterval();

    @Query("SELECT u FROM User u WHERE u.married = false")
    List<User> findUsersNotMarried();

    @Query("SELECT u FROM User u WHERE u.age = :age")
    List<User> findUsersAge(@Param("age") int age);

    @Query("SELECT u FROM User u WHERE u.age IS NOT NULL AND u.married = true AND u.age > 18")
    List<User> findMarriedAndAgeGreater18();






}
