package com.example.crud_car_thymeleaf_jpa.service.impl;

import com.example.crud_car_thymeleaf_jpa.model.Car;
import com.example.crud_car_thymeleaf_jpa.repository.ICarRepository;
import com.example.crud_car_thymeleaf_jpa.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarService implements ICarService {

    @Autowired
    private ICarRepository iCarRepository;

    @Override
    public void create(Car car) {
        iCarRepository.save(car);
    }

    @Override
    public void update(Car car) {
        iCarRepository.save(car);
    }

    @Override
    public void deleteById(Long id) {
        iCarRepository.deleteById(id);
    }

    @Override
    public ArrayList<Car> findAll() {
        return (ArrayList<Car>) iCarRepository.findAll();
    }

    @Override
    public Car findById(Long id) {
        if (iCarRepository.findById(id).isPresent()) {
            return iCarRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public ArrayList<Car> findAllByName(String name) {
        return iCarRepository.findAllByNameContaining(name);
    }

    @Override
    public ArrayList<Car> findTop3() {
        return iCarRepository.findTop3(3);
    }
}
