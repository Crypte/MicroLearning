package com.example.ishiki.service;

import com.example.ishiki.dao.CardDAO;
import com.example.ishiki.dao.CourseDAO;
import com.example.ishiki.dao.FieldDAO;
import com.example.ishiki.dto.CourseDTO;
import com.example.ishiki.mapper.CourseMapper;
import com.example.ishiki.model.Card;
import com.example.ishiki.model.Course;
import com.example.ishiki.model.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseDAO courseDAO;
    @Autowired
    private FieldDAO fieldDAO;
    @Autowired
    private CardDAO cardDAO;

    public List<Course> getAllCourses() {
        return courseDAO.findAll();
    }

    public Course getCourseById(Long id) {
        return courseDAO.findById(id).orElseThrow();
    }

    public List<Card> getCardsFromCourse(long courseId) {
        return cardDAO.findByCourseId(courseId);
    }

    @Transactional
    public Course addCourse(CourseDTO courseDTO) {
        Course newCourse = new Course();
        try {
            Field field = fieldDAO.findById(courseDTO.getField_id()).orElseThrow();
            newCourse = CourseMapper.fromCourseDTO(courseDTO, field);
            return courseDAO.save(newCourse);
        } catch (Exception e){
            throw new RuntimeException("Error while saving course " + courseDTO);
        }
    }

    @Transactional
    public Course updateCourse(Course course) {
        return courseDAO.save(course);
    }

    @Transactional
    public void deleteCourse(Long id) {
        courseDAO.deleteById(id);
    }
}
