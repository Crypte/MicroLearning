package com.example.ishiki.service;

import com.example.ishiki.dao.CourseDAO;
import com.example.ishiki.dao.FieldDAO;
import com.example.ishiki.model.Course;
import com.example.ishiki.model.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldService {

    @Autowired
    private FieldDAO fieldDAO;
    @Autowired
    private CourseDAO courseDAO;

    public List<Field> getAllFields() {
        return fieldDAO.findAll();
    }

    public Field getFieldById(Long id) {
        return fieldDAO.findById(id).orElseThrow();
    }
    public Field saveField(Field field) {
        return fieldDAO.save(field);
    }

    public void deleteFieldById(Long id) {
        fieldDAO.deleteById(id);
    }

    public List<Course> getCoursesFromField(Long fieldId) {
        List<Course> courses = courseDAO.findByFieldId(fieldId);
        return courses;
    }


}
