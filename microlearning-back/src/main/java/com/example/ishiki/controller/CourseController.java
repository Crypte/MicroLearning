package com.example.ishiki.controller;

import com.example.ishiki.dto.CourseDTO;
import com.example.ishiki.model.Card;
import com.example.ishiki.model.Course;
import com.example.ishiki.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }

    @GetMapping("/{id}/cards")
    public List<Card> getCardsByCourseId(@PathVariable Long id) {
        return courseService.getCardsFromCourse(id);
    }

    @PostMapping
    public Course addCourse(@RequestBody CourseDTO course) {
        return courseService.addCourse(course);
    }
    @PutMapping
    public Course updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }
}
