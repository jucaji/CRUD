package com.crud.crudprueba.data.crud;


import com.crud.crudprueba.data.entity.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaymentCrudRepository extends CrudRepository<Payment, Integer> {



}
