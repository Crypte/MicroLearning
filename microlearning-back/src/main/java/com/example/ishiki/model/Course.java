package com.example.ishiki.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "courses")
@NoArgsConstructor
@Getter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "course_seq", sequenceName = "courses_seq", allocationSize = 1)
    private long id;
    private String name;
    private String content;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "field_id")
    private Field field;

    @OneToMany(mappedBy = "course")
    @JsonIgnore
    private List<Card> cards;

    // Constructeur prenant un Builder
    private Course(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.content = builder.content;
        this.field = builder.field;
        this.cards = builder.cards;
    }

    public static final class Builder {
        private long id;
        private String name;
        private String content;
        private Field field;
        private List<Card> cards;

        public Builder() {
        }

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder field(Field field) {
            this.field = field;
            return this;
        }

        public Builder cards(List<Card> cards) {
            this.cards = cards;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}
