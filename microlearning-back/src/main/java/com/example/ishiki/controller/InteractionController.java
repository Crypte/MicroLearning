package com.example.ishiki.controller;

import com.example.ishiki.model.Card;
import com.example.ishiki.model.Interaction;
import com.example.ishiki.model.User;
import com.example.ishiki.model.schemas.LikeRequest;
import com.example.ishiki.service.CardService;
import com.example.ishiki.service.InteractionService;
import com.example.ishiki.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class InteractionController {

    @Autowired
    private InteractionService interactionService;
    @Autowired
    private UserService userService;
    @Autowired
    private CardService cardService;

    @PostMapping("/like")
    public void addUserLikeCard(@RequestBody LikeRequest likeRequest){
        User user = userService.getUserById(likeRequest.getUserId());
        Card card = cardService.getCardById(likeRequest.getCardId());
        Interaction interaction = new Interaction.Builder().user(user).card(card).createdAt(new Date()).build();
        interactionService.addInteraction(interaction);
    }

    @DeleteMapping("/dislike")
    public void deleteUserLikeCard(@RequestBody LikeRequest likeRequest){
        interactionService.deleteByUserIdAndCardId(likeRequest.getUserId(),likeRequest.getCardId());
    }
}
