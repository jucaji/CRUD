package com.crud.crudprueba.data.crud;

import com.crud.crudprueba.data.entity.Cash;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICashCrudRepository extends CrudRepository<Cash, Integer>{
}
