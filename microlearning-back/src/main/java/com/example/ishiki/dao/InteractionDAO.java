package com.example.ishiki.dao;


import com.example.ishiki.model.Interaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InteractionDAO extends JpaRepository<Interaction, Long> {
    Optional<Interaction> findInteractionById(long id);
    Optional<List<Interaction>> findInteractionsByUserId(long userId);
    Optional<List<Interaction>> findInteractionByCard_Id(long cardId);
    Optional<Interaction> findInteractionByCard_IdAndUserId(long cardId, long userId);
    Optional<Interaction> deleteByCard_IdAndUserId(long cardId, long userId);
}
