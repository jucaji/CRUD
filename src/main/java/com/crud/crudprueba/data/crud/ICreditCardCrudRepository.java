package com.crud.crudprueba.data.crud;

import com.crud.crudprueba.data.entity.CreditCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICreditCardCrudRepository extends CrudRepository<CreditCard, Integer>{

}
