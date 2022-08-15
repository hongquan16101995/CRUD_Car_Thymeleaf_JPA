package com.example.crud_car_thymeleaf_jpa.repository;

import com.example.crud_car_thymeleaf_jpa.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

public interface ICarRepository extends JpaRepository<Car, Long> {
    ArrayList<Car> findAllByNameContaining(String name);

    @Query(value = "select * from car order by price asc limit :amount", nativeQuery = true)
    ArrayList<Car> findTop3(@Param("amount") int amount);
}
