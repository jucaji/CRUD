package com.crud.crudprueba.data.crud;

import com.crud.crudprueba.data.entity.Driver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDriverCrudRepository extends CrudRepository<Driver, Integer>{
    Driver findByNameDriver(String name);

    Driver findByDocumentDriver(String document);
}
