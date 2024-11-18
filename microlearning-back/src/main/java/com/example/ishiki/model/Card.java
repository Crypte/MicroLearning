package com.example.ishiki.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="cards")
@NoArgsConstructor
@Getter
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "card_seq", sequenceName = "cards_seq", allocationSize = 1)
    private long id;
    private String title;
    private String content;
    @Column(name="created_at")
    private Date createdAt = new Date();
    private String img;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "course_id")
    private Course course;
}
