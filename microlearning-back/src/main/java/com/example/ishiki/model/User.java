package com.example.ishiki.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="users")
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "user_seq", sequenceName = "users_seq", allocationSize = 1)
    private long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private String subscription_type;
    private Date created_at = new Date();
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Interaction> interactions;

    public User(long id, String username, String password, String firstName, String lastName, String email, String subscription_type, Date created_at, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.subscription_type = subscription_type;
        this.created_at = created_at;
    }

    public User(Builder builder){
        this.id = builder.id;
        this.username = builder.username;
        this.password = builder.password;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.subscription_type = builder.subscriptionType;
        this.created_at = builder.createdAt;
        this.role = builder.role;
    }


    public static final class Builder {
        private long id;
        private String username;
        private String password;
        private String firstName;
        private String lastName;
        private String email;
        private String subscriptionType;
        private Date createdAt;
        private String role;

        public Builder() {
        }

        public static Builder anUser() {
            return new Builder();
        }

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder subscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }

        public Builder createdAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public User build() {
            return new User(id, username, password, firstName, lastName, email, subscriptionType, createdAt, role);
        }
    }
}
