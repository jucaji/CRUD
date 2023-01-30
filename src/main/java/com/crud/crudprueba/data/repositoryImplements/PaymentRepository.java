package com.crud.crudprueba.data.repositoryImplements;

import com.crud.crudprueba.data.crud.IPaymentCrudRepository;
import com.crud.crudprueba.domain.repository.IPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository implements IPaymentRepository {

    @Autowired
    IPaymentCrudRepository paymentCrudRepository;
}
