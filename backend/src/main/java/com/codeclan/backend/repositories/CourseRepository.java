package com.codeclan.backend.repositories;

import com.codeclan.backend.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository {

    List<Course> findByRating(Integer rating);


    List<Course> findByCustomerId(Long customerId);
}
