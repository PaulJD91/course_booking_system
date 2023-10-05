package com.codeclan.backend.components;

import com.codeclan.backend.models.Booking;
import com.codeclan.backend.models.Course;
import com.codeclan.backend.models.Customer;
import com.codeclan.backend.repositories.BookingRepository;
import com.codeclan.backend.repositories.CourseRepository;
import com.codeclan.backend.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;

import java.time.LocalDate;

@Profile("!test") //Run every time EXCEPT Tests
// @Component //comment this out once db has been seeded
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Course course1 = new Course("Python", "Edinburgh", 4);
        courseRepository.save(course1);


        Course course2 = new Course("HTML + CSS", "Glasgow", 3);
        courseRepository.save(course2);

        Course course3 = new Course("Javascript", "Edinburgh", 2);
        courseRepository.save(course3);

        Course course4 = new Course("Java", "Glasgow", 4);
        courseRepository.save(course4);

        LocalDate courseDate1 =  LocalDate.of(2023,10,5);
        LocalDate courseDate2 =  LocalDate.of(2023,11,14);
        Booking booking1 = new Booking(courseDate1);
        bookingRepository.save(booking1);


        Booking booking2 = new Booking(courseDate2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking(courseDate2);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking(courseDate2);
        bookingRepository.save(booking4);


        Booking booking5 = new Booking(courseDate1);
        bookingRepository.save(booking5);


        Booking booking6 = new Booking(courseDate1);
        bookingRepository.save(booking6);

        Booking booking7 = new Booking(courseDate1);
        bookingRepository.save(booking7);

        Booking booking8 = new Booking(courseDate2);
        bookingRepository.save(booking8);

        LocalDate davesDob =  LocalDate.of(1990,5,3);
        Customer customer1 = new Customer("Dave", "Edinburgh", davesDob);
        customerRepository.save(customer1);

        LocalDate karensDob =  LocalDate.of(1985,8,30);
        Customer customer2 = new Customer("Karen", "Glasgow", karensDob);
        customerRepository.save(customer2);

        LocalDate iansDob =  LocalDate.of(1960,1, 17);
        Customer customer3 = new Customer("Ian", "Edinburgh", iansDob);
        customerRepository.save(customer3);

        LocalDate susanDob =  LocalDate.of(1999,12,22);
        Customer customer4 = new Customer("Susan", "Glasgow", susanDob);
        customerRepository.save(customer4);


    }
}

