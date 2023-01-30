package com.crud.crudprueba.domain.service;

import com.crud.crudprueba.data.entity.CreditCard;
import com.crud.crudprueba.data.entity.Cash;

import java.util.List;

public interface IPaymentService {

    List<CreditCard> findAllCards();
    CreditCard findCardById(Integer id);
    CreditCard saveCard(CreditCard creditCard);
    CreditCard updateCard(CreditCard creditCard, Integer id);
    void deleteCard(CreditCard creditCard);
    void deleteCardById(Integer id);
    List<Cash> findAllCash();
    Cash findCashById(Integer id);
    Cash saveCash(Cash cash);
    Cash updateCash(Cash cash, Integer id);
    void deleteCash(Cash cash);
    void deleteCashById(Integer id);
}
