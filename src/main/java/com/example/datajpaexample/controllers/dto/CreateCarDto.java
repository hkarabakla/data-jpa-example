package com.example.datajpaexample.controllers.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Set;

public class CreateCarDto {

    private String brand;
    private String model;

    @JsonFormat(pattern = "dd.MM.yyyy")
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private LocalDate registration;

    private Set<CreatePaymentDto> payments;

    public CreateCarDto() {
    }

    public CreateCarDto(String brand, String model, LocalDate registration, Set<CreatePaymentDto> payments) {
        this.brand = brand;
        this.model = model;
        this.registration = registration;
        this.payments = payments;
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
