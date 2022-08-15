package com.example.crud_car_thymeleaf_jpa.common;

import java.util.ArrayList;

public interface ICRUDService<E> {
    void create(E e);

    void update(E e);

    void deleteById(Long id);

    ArrayList<E> findAll();

    E findById(Long id);

    ArrayList<E> findAllByName(String name);
}
