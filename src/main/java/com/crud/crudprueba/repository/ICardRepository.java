package com.crud.crudprueba.repository;

import com.crud.crudprueba.entity.Card;
import org.springframework.data.repository.CrudRepository;

public interface ICardRepository extends CrudRepository<Card, Long>{

}
