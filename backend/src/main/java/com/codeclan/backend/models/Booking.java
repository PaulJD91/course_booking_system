package com.codeclan.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "date")
    private LocalDate date;
    @ManyToOne
    @JsonIgnoreProperties({"bookings"})
    @Cascade(CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "customer_course",
            joinColumns = {
                    @JoinColumn(
                            name = "course_id",
                            nullable = false,
                            updatable = false
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "customer_id",
                            nullable = false,
                            updatable = false
                    )
            }
    )
    private List<Customer> customers;

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }


    public Booking(LocalDate date) {
        this.date = date;
    }
    public Booking(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
