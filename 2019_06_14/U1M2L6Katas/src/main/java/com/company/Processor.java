package com.company;

public class Processor extends Memory{
    private String manufacturer;
    private String modelNo;
    private String speed;
    private String cacheSize;

    public void Processor(String getManufacturer, String getModelNo, String getSpeed, String getCacheSpeed) {

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(String cacheSize) {
        this.cacheSize = cacheSize;
    }
}
