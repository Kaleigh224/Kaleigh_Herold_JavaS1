package com.company;

import com.company.Interfaces.Vehicle;

public class Car implements Vehicle {
    private String make;
    private String model;
    private int milesTraveled;

    public void Car(String getMake, String getModel, int getMilesTraveled) {

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMilesTraveled() {
        return milesTraveled;
    }

    public void setMilesTraveled(int milesTraveled) {
        this.milesTraveled = milesTraveled;
    }

    @Override
    public void drive() {

    }

    @Override
    public void displayMilesTraveled() {

    }
}
