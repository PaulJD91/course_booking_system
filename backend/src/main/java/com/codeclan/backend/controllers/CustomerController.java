package com.codeclan.backend.controllers;

import com.codeclan.backend.models.Course;
import com.codeclan.backend.models.Customer;
import com.codeclan.backend.repositories.CourseRepository;
import com.codeclan.backend.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }

//    @GetMapping(value = "/customers/course_id")
//    private ResponseEntity<List<Customer>> findByCourseId(@RequestParam(name = "course_id", required = false, defaultValue = "0") Long course_id){
//        if (course_id == 0) {
//            return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(customerRepository.findByCourseId(course_id), HttpStatus.OK);
//        }
//    }
}
