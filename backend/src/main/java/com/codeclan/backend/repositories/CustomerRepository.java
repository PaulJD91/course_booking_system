package com.codeclan.backend.repositories;

import com.codeclan.backend.models.Course;
import com.codeclan.backend.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository <Customer, Long> {
//    List<Customer>getAllCustomers(String name);

//    List<Customer> findByCourseId(Long courseId);
}

