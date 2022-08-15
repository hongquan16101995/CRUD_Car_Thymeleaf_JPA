package com.example.crud_car_thymeleaf_jpa.service;

import com.example.crud_car_thymeleaf_jpa.common.ICRUDService;
import com.example.crud_car_thymeleaf_jpa.model.Car;

import java.util.ArrayList;

public interface ICarService extends ICRUDService<Car> {
    ArrayList<Car> findTop3();
}
