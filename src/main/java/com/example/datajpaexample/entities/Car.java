package com.example.datajpaexample.entities;

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
    private LocalDate registration;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Payments> payments;

    @Version
    private Long version;

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

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", registration=" + registration +
                ", payments=" + payments +
                ", version=" + version +
                '}';
    }
}
