package com.example.ishiki.service;

import com.example.ishiki.dao.InteractionDAO;
import com.example.ishiki.model.Interaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteractionService {

    @Autowired
    private InteractionDAO interactionDAO;

    public List<Interaction> getAllInteractions() {
        return interactionDAO.findAll();
    }
    public Interaction getInteractionById(int id) {
        return interactionDAO.findInteractionById(id).orElseThrow();
    }
    public void addInteraction(Interaction interaction) {
        interactionDAO.save(interaction);
    }
    public void updateInteraction(Interaction interaction) {
        interactionDAO.save(interaction);
    }
    public void deleteInteractionById(Long id) {
        interactionDAO.deleteById(id);
    }
    public void deleteByUserIdAndCardId(Long userId, Long cardId) {
        interactionDAO.deleteByCard_IdAndUserId(userId, cardId);
    }
}
