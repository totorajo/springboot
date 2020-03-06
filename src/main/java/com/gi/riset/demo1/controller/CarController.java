package com.gi.riset.demo1.controller;


import com.gi.riset.demo1.domain.Car;
import com.gi.riset.demo1.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//Tambahkan daftar cars
@RestController
@RequestMapping("/api/cars")

public class CarController {

    //Tidak perlu ada inisialilasi
    @Autowired
    private CarRepository carRepository;

    @PostMapping
    public Car addNewCar(@RequestBody Car car) {
        return carRepository.save(car);
    }

    @GetMapping
    public  Iterable<Car> getCar() {
        return carRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Car> getCarById(@PathVariable("id") String id) {
        return carRepository.findById(Long.parseLong(id));
    }

    @DeleteMapping("/{id}")
    public void deleteCardByid(@PathVariable("id") Long id) {
        carRepository.deleteById(id);
    }
}
