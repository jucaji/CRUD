package com.crud.crudprueba.domain.service;

import com.crud.crudprueba.data.entity.CreditCard;
import com.crud.crudprueba.data.entity.Cash;
import com.crud.crudprueba.data.crud.ICreditCardCrudRepository;
import com.crud.crudprueba.data.crud.ICashCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService implements IPaymentService {

    @Autowired
    private ICreditCardCrudRepository cardRepository;

    @Autowired
    private ICashCrudRepository cashRepository;

    @Override
    public List<CreditCard> findAllCards() {
        return (List<CreditCard>) cardRepository.findAll();
    }

    @Override
    public CreditCard findCardById(Integer id) {
        return cardRepository.findById(id).orElse(null);
    }

    @Override
    public CreditCard saveCard(CreditCard creditCard) {
        return cardRepository.save(creditCard);
    }

    @Override
    public CreditCard updateCard(CreditCard creditCard, Integer id) {
        return cardRepository.save(creditCard);
    }

    @Override
    public void deleteCard(CreditCard creditCard) {
        cardRepository.delete(creditCard);
    }

    @Override
    public void deleteCardById(Integer id) {
        cardRepository.deleteById(id);
    }

    @Override
    public List<Cash> findAllCash() {
        return (List<Cash>) cashRepository.findAll();
    }

    @Override
    public Cash findCashById(Integer id) {
        return cashRepository.findById(id).orElse(null);
    }

    @Override
    public Cash saveCash(Cash cash) {
        return cashRepository.save(cash);
    }

    @Override
    public Cash updateCash(Cash cash, Integer id) {
        return cashRepository.save(cash);
    }

    @Override
    public void deleteCash(Cash cash) {
        cashRepository.delete(cash);
    }

    @Override
    public void deleteCashById(Integer id) {
        cashRepository.deleteById(id);
    }
}
