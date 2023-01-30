package com.crud.crudprueba.data.crud;

import com.crud.crudprueba.data.entity.Route;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IRouteCrudRepository extends CrudRepository<Route, Integer>{
}
