package com.example.datajpaexample.controllers.dto;

import com.example.datajpaexample.entities.Car;
import org.springframework.core.convert.converter.Converter;

public class CreateCarDtoToCarMapper implements Converter<CreateCarDto, Car> {
    @Override
    public Car convert(CreateCarDto carDto) {
        return new Car(carDto.getBrand(), carDto.getModel(), carDto.getRegistration());
    }
}
