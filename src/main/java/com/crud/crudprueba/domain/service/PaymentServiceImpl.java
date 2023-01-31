package com.crud.crudprueba.domain.service;

import com.crud.crudprueba.data.crud.IPaymentCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements IPaymentService {

    @Autowired
    private IPaymentCrudRepository paymentRepository;

}
