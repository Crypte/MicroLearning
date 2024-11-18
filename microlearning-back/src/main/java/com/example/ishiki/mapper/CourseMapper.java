package com.example.ishiki.mapper;

import com.example.ishiki.dto.CourseDTO;
import com.example.ishiki.model.Course;
import com.example.ishiki.model.Field;

public class CourseMapper {

    public static Course fromCourseDTO(CourseDTO dto, Field field) {
        return new Course.Builder()
                .name(dto.getName())
                .content(dto.getContent())
                .field(field)
                .build();
    }

    public static CourseDTO toCourseDTO(Course course) {
        return CourseDTO.builder()
                .id(course.getId())
                .name(course.getName())
                .content(course.getContent())
                .field_id(course.getField() != null ? course.getField().getId() : null)
                .build();
    }
}
