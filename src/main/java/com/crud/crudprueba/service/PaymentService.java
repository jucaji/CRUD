package com.crud.crudprueba.service;

import com.crud.crudprueba.entity.Card;
import com.crud.crudprueba.entity.Cash;
import com.crud.crudprueba.repository.ICardRepository;
import com.crud.crudprueba.repository.ICashRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService implements IPaymentServiceImpl{

    @Autowired
    private ICardRepository cardRepository;

    @Autowired
    private ICashRepository cashRepository;

    @Override
    public List<Card> findAllCards() {
        return (List<Card>) cardRepository.findAll();
    }

    @Override
    public Card findCardById(Integer id) {
        return cardRepository.findById(id).orElse(null);
    }

    @Override
    public Card saveCard(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public Card updateCard(Card card, Integer id) {
        return cardRepository.save(card);
    }

    @Override
    public void deleteCard(Card card) {
        cardRepository.delete(card);
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
