package com.company;

//import com.sun.xml.internal.ws.api.pipe.Engine;

public class Accord extends Sedan{
    private String year;
    private Engine engine;
    private Transmission transmission;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void Accord(String getYear, Engine getEngine, Transmission getTransmission) {
    }

}
