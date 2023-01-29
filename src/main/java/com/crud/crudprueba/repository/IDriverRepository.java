package com.crud.crudprueba.repository;

import com.crud.crudprueba.entity.Driver;
import org.springframework.data.repository.CrudRepository;

public interface IDriverRepository extends CrudRepository<Driver, Integer>{
    Driver findByNameDriver(String name);

    Driver findByDocumentDriver(String document);
}
