package com.crud.crudprueba.domain.service;

import com.crud.crudprueba.data.entity.Payment;


import java.util.List;

public interface IPaymentService {

    List<Payment> findAllCards();

    Payment saveCard(Payment creditCard);

    void deleteCardById(Integer id);


}
