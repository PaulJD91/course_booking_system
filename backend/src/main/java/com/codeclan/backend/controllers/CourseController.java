package com.codeclan.backend.controllers;

import com.codeclan.backend.models.Course;
import com.codeclan.backend.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public ResponseEntity<List<Course>> getAllCourses(){
        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/courses/rating")
    private ResponseEntity<List<Course>> getCourseByRating(@RequestParam(name = "rating", required = false, defaultValue = "0") int rating){
        if (rating == 0) {
            return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(courseRepository.findByRating(rating), HttpStatus.OK);
        }
    }

//    @GetMapping(value = "/courses/customer_id")
//    private ResponseEntity<List<Course>> getCourseByCustomerId(@RequestParam(name = "customer_id", required = false, defaultValue = "0") Long customer_id){
//        if (customer_id == 0) {
//            return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(courseRepository.findByCustomerId(customer_id), HttpStatus.OK);
//        }
//    }
}
