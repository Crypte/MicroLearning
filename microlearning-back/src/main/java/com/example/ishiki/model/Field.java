package com.example.ishiki.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="fields")
@NoArgsConstructor
@Getter

public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "field_seq", sequenceName = "fields_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String description;
    private Date created_at = new Date();
    @OneToMany(mappedBy = "field")
    @JsonIgnore
    private List<Course> courses;
}
