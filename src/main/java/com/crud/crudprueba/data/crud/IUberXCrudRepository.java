package com.crud.crudprueba.data.crud;

import com.crud.crudprueba.data.entity.UberX;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUberXCrudRepository extends CrudRepository<UberX, Integer> {
}
