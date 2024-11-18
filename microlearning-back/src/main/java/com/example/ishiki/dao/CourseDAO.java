package com.example.ishiki.dao;

import com.example.ishiki.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDAO extends JpaRepository<Course,Long> {
    List<Course> findByFieldId(Long fieldId);
}
