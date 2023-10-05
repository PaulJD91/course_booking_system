package com.codeclan.backend.controllers;

import com.codeclan.backend.models.Booking;
import com.codeclan.backend.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@RestController
public class BookingController {
    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/bookings")
    public ResponseEntity<List<Booking>> getBookings(
            @RequestParam(name = "date", required = false) LocalDate date) {
        if (date != null ) {
            return new ResponseEntity<>(bookingRepository.findByDate(date), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(bookingRepository.findAll(), HttpStatus.OK);
        }
    }

}
