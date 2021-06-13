package com.example.datajpaexample;

import com.example.datajpaexample.entities.Car;
import com.example.datajpaexample.entities.Payments;
import com.example.datajpaexample.respositories.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class DataJpaExampleApplication implements CommandLineRunner {

    private CarRepository carRepository;

    public DataJpaExampleApplication(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DataJpaExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        Car car = new Car("Audi", "A7", LocalDate.now());
//        Car car2 = new Car("Audi", "Q8S", LocalDate.now());
//
//        Car car3 = new Car("Audi", "A4", LocalDate.now());
//        Car car4 = new Car("Audi", "A5", LocalDate.now());
//
//        Car car5 = new Car("Audi", "A6", LocalDate.now());
//        Car car6 = new Car("Audi", "A8", LocalDate.now());
//
//        carRepository.saveAll(Arrays.asList(car, car2, car3, car4, car5, car6));
//
//
//
//        Payments tax = new Payments("Tax", 10.50, LocalDate.now(), car);
//        Payments park = new Payments("Park", 10.50, LocalDate.now(), car);
//        Payments insurance = new Payments("Insurance", 10.50, LocalDate.now(), car);
//
//        car.setPayments(Collections.singleton(tax));
//
//        car = carRepository.save(car);
//
////        System.out.println(car);
////        System.out.println(car2);

//        System.out.println(carRepository.findAllByPaymentsPaymentTypeAndPaymentsPaymentDateBefore("Tax", LocalDate.now()));
//
//
//        PageRequest of = PageRequest.of(10, 2);


//        Page<Car> all = carRepository.findAll(of);
//        all.forEach(c -> System.out.println(c));
//        System.out.println("Pages :" + all.getTotalPages());
//        System.out.println("Todal :" + all.getTotalElements());

//
//        Page<Car> paged = carRepository.findAllByBrand("Audi", of);
//        paged.forEach(c -> System.out.println(c));
//        System.out.println("Pages :" + paged.getTotalPages());
//        System.out.println("Total :" + paged.getTotalElements());
    }
}
