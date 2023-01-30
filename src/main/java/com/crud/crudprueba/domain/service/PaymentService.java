package com.crud.crudprueba.domain.service;

import com.crud.crudprueba.data.crud.IPaymentCrudRepository;
import com.crud.crudprueba.data.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService implements IPaymentService {

    @Autowired
    private IPaymentCrudRepository paymentRepository;

    @Override
    public List<Payment> findAllCards() {
        return (List<Payment>) paymentRepository.findAll();
    }

    @Override
    public Payment saveCard(Payment creditCard) {
        return paymentRepository.save(creditCard);
    }

    @Override
    public void deleteCardById(Integer id) {
        paymentRepository.deleteById(id);
    }
}
