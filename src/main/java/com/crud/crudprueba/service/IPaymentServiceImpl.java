package com.crud.crudprueba.service;

import com.crud.crudprueba.entity.Card;
import com.crud.crudprueba.entity.Cash;

import java.util.List;

public interface IPaymentServiceImpl {

    List<Card> findAllCards();
    Card findCardById(Integer id);
    Card saveCard(Card card);
    Card updateCard(Card card, Integer id);
    void deleteCard(Card card);
    void deleteCardById(Integer id);
    List<Cash> findAllCash();
    Cash findCashById(Integer id);
    Cash saveCash(Cash cash);
    Cash updateCash(Cash cash, Integer id);
    void deleteCash(Cash cash);
    void deleteCashById(Integer id);
}
