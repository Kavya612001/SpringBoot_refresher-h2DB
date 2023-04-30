package com.learn.springbootbasic.LearnBasic.controller;

import com.learn.springbootbasic.LearnBasic.Repository.CourseRepository;
import com.learn.springbootbasic.LearnBasic.bean.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository repository;

    //https://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
//        return Arrays.asList(new Course(1, "Learn Microservices using SpringBoot", "Udemy instructor"),
//                new Course(2, "Learn React", "John Smilga"));
        return repository.findAll();
    }

    //https://localhost:8080/courses/1
    @GetMapping("/courses/{id}")
    public Course getCourse(@PathVariable long id) {
        Optional<Course> course = repository.findById(id);
        if(!course.isPresent()) {
            throw new RuntimeException("Course not found with id "+ id);
        }
        return course.get();
//        return new Course(1, "Learn Microservices", "Udemy instructor");
    }

    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course) {
        repository.save(course);
    }

    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable long id, @RequestBody Course course) {
        repository.save(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id) {
        repository.deleteById(id);
    }

}
