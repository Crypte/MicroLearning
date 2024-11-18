package com.example.ishiki.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "interactions")
@NoArgsConstructor
@Getter
public class Interaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "card_id")
    private Card card;

    @Column(name = "created_at")
    private Date createdAt;

    // Constructeur privé qui prend un Builder
    private Interaction(Builder builder) {
        this.id = builder.id;
        this.user = builder.user;
        this.card = builder.card;
        this.createdAt = builder.createdAt;
    }

    // Builder pour la classe Interaction
    public static final class Builder {
        private Long id;
        private User user;
        private Card card;
        private Date createdAt;

        // Constructeur par défaut
        public Builder() {
        }

        // Méthode pour définir l'ID
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        // Méthode pour définir l'utilisateur
        public Builder user(User user) {
            this.user = user;
            return this;
        }

        // Méthode pour définir la carte
        public Builder card(Card card) {
            this.card = card;
            return this;
        }

        // Méthode pour définir la date de création
        public Builder createdAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        // Méthode pour construire l'objet Interaction
        public Interaction build() {
            return new Interaction(this);
        }
    }
}
