package com.example.datajpaexample.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Payments {

    @Id
    @GeneratedValue
    private Long id;

    private String paymentType;
    private Double price;
    private LocalDate paymentDate;
    @ManyToOne
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    private Car car;

    public Payments() {
    }

    public Payments(String paymentType, Double price, LocalDate paymentDate, Car car) {
        this.paymentType = paymentType;
        this.price = price;
        this.paymentDate = paymentDate;
        this.car = car;
    }

    public Payments(Long id, String paymentType, Double price, LocalDate paymentDate, Car car) {
        this.id = id;
        this.paymentType = paymentType;
        this.price = price;
        this.paymentDate = paymentDate;
        this.car = car;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Payments{" +
                "id=" + id +
                ", paymentType='" + paymentType + '\'' +
                ", price=" + price +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
