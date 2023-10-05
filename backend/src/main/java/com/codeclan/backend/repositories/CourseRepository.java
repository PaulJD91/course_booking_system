package com.codeclan.backend.repositories;

import com.codeclan.backend.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByRating(Integer rating);


    List<Course> findByCustomerId(Long customerId);
}
