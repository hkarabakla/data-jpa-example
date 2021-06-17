package com.example.datajpaexample.config;

import com.example.datajpaexample.controllers.dto.CreateCarDto;
import com.example.datajpaexample.controllers.dto.CreateCarDtoToCarMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

@Configuration
public class ConverterConfig {


    @Bean
    public ConversionService conversionService() {
        DefaultConversionService conversionService = new DefaultConversionService();
        conversionService.addConverter(new CreateCarDtoToCarMapper());

        return conversionService;
    }
}
