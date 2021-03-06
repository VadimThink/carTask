package edu.epam.carsTask.entity;

import java.util.Objects;

public class Car {

    private int id;
    private String color;
    private String brand;
    private int year;
    private String model;
    private int price;
    private String registrationNumber;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }

    public Car(int id, String color, String brand, int year, String model, int price, String registrationNumber) {
        this.color = color;
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                year == car.year &&
                price == car.price &&
                color.equals(car.color) &&
                brand.equals(car.brand) &&
                model.equals(car.model) &&
                registrationNumber.equals(car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, color, brand, year, model, price, registrationNumber);
    }
}
