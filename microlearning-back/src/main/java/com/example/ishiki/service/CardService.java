package com.example.ishiki.service;

import com.example.ishiki.dao.CardDAO;
import com.example.ishiki.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    @Autowired
    private CardDAO cardDAO;

    public List<Card> getAllCards() {
        return cardDAO.findAll();
    }

    public Card getCardById(Long id) {
        return cardDAO.findById(id).orElseThrow();
    }
    public Card createCard(Card card) {
        return cardDAO.save(card);
    }
    public Card updateCard(Card card) {
        return cardDAO.save(card);
    }
    public void deleteCard(Long id) {
        cardDAO.deleteById(id);
    }
}
