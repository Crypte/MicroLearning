package com.example.ishiki.dao;

import com.example.ishiki.model.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldDAO extends JpaRepository<Field, Long> {

}
