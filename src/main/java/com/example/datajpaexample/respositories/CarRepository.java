package com.example.datajpaexample.respositories;

import com.example.datajpaexample.entities.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.time.LocalDate;
import java.util.List;

public interface CarRepository extends PagingAndSortingRepository<Car, Long> {

    List<Car> findAllByPaymentsPaymentTypeAndPaymentsPaymentDateBefore(String paymentType, LocalDate paymentDate);

    List<Car> findAllByBrand(String brand);
}
