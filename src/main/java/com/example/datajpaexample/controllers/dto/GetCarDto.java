package com.example.datajpaexample.controllers.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Set;

public class GetCarDto {

    private Long id;
    private String brand;
    private String model;

    @JsonFormat(pattern = "dd.MM.yyyy")
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private LocalDate registration;

    private Set<CreatePaymentDto> payments;

    public GetCarDto() {
    }

    public GetCarDto(Long id, String brand, String model, LocalDate registration, Set<CreatePaymentDto> payments) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.registration = registration;
        this.payments = payments;
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

    public Set<CreatePaymentDto> getPayments() {
        return payments;
    }

    public void setPayments(Set<CreatePaymentDto> payments) {
        this.payments = payments;
    }
}
