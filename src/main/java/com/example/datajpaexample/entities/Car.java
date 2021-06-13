package com.example.datajpaexample.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private Long id;

    private String brand;
    private String model;

    @JsonFormat(pattern = "dd.MM.yyyy")
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private LocalDate registration;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Payments> payments;

    public Car() {
    }

    public Car(String brand, String model, LocalDate registration) {
        this.brand = brand;
        this.model = model;
        this.registration = registration;
    }

    public Car(Long id, String brand, String model, LocalDate registration) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.registration = registration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getRegistration() {
        return registration;
    }

    public void setRegistration(LocalDate registration) {
        this.registration = registration;
    }

    public Set<Payments> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payments> payments) {
        this.payments = payments;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", registration=" + registration +
                ", payments=" + payments +
                '}';
    }
}
