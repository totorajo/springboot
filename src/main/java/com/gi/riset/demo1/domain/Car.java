package com.gi.riset.demo1.domain;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//1. supaya bisa untuk membuat tabel
@Entity

//Membuat blueprint ketika belum ada.
public class Car {
    //2. Menjadikan variabel dibawahnya menjadi ID
    @Id

    //3. Memberikan instruksi untuk ID berupa int atau string
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String brand;
    private String model;
    private String color;
    private String fuel;
    private int year;

    //4. membuat constructor untuk menjadikan pemanggilan domain berjalan normal
    //mac : command + N,
    //non mac : alt+insert

    public Car() {
    }

    //5. Untuk contructor dapat di set nilainya, selain id
    public Car(String brand, String model, String color, String fuel, int year) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.fuel = fuel;
        this.year = year;
    }

    //6. membuat setter and getter,
    //mac : command + N,
    //non mac : alt+insert
    //pilih setter and getter select all

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
