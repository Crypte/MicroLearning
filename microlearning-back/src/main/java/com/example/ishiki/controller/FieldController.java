package com.example.ishiki.controller;


import com.example.ishiki.model.Course;
import com.example.ishiki.model.Field;
import com.example.ishiki.service.CourseService;
import com.example.ishiki.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/fields")
public class FieldController {

    @Autowired
    private FieldService fieldService;
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Field> getAllFields(){
        return fieldService.getAllFields();
    }

    @GetMapping("/{id}/courses")
    public List<Course> getCoursesFromField(@PathVariable long id){

        return fieldService.getCoursesFromField(id);
    }

    @GetMapping("/{id}")
    public Field getFieldById(@PathVariable Long id){
        return fieldService.getFieldById(id);
    }

    @PostMapping
    public Field createField(@RequestBody Field field){
        return fieldService.saveField(field);
    }

    @PutMapping
    public Field updateFieldById(@RequestBody Field field){
        return fieldService.saveField(field);
    }

    @DeleteMapping("/{id}")
    public void deleteFieldById(@PathVariable Long id){
        fieldService.deleteFieldById(id);
    }


}
