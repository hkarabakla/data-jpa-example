package com.example.datajpaexample.controllers;

import com.example.datajpaexample.controllers.dto.CreateCarDto;
import com.example.datajpaexample.entities.Car;
import com.example.datajpaexample.respositories.CarRepository;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarRepository carRepository;
    private final ConversionService conversionService;

    public CarController(CarRepository carRepository, ConversionService conversionService) {
        this.carRepository = carRepository;
        this.conversionService = conversionService;
    }

    @PostMapping(produces = "application/vnd.car.api.v2+json")
    @ResponseStatus(HttpStatus.CREATED)
    public Car saveCar(@RequestBody CreateCarDto carDto) {

        return carRepository.save(conversionService.convert(carDto, Car.class));
    }

    @PostMapping(produces = "application/vnd.car.api.v1+json")
    @ResponseStatus(HttpStatus.CREATED)
    public Car saveCar(@RequestBody Car car) {
        return carRepository.save(car);
    }

    @PutMapping("/{id}")
    public Car updateCar(@RequestBody Car car, @PathVariable long id) {
        Car persistedCar = carRepository.findById(id).get();
        persistedCar.setModel(car.getModel());
        persistedCar.setBrand(car.getBrand());
        persistedCar.setRegistration(car.getRegistration());
        persistedCar.setPayments(car.getPayments());
        return carRepository.save(persistedCar);
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
