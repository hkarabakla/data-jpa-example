package com.example.datajpaexample.controllers;

import com.example.datajpaexample.entities.Car;
import com.example.datajpaexample.respositories.CarRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Car saveCar(@RequestBody Car car) {
        return carRepository.save(car);
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id,
                          @RequestHeader("User-Agent") String userAgent) {
        System.out.println(userAgent);
        if (userAgent.contains("android")) {
            return null;
        }
        return carRepository.findById(id).get();
    }

    @GetMapping
    public List<Car> getCars(@RequestParam("carBrand") String brand) {
        return carRepository.findAllByBrand(brand);
    }
}
