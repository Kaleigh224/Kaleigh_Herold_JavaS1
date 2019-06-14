package com.company;

public class Kitchen {
    private String size;
    private int numOfCabinets;
    private String sinkSize;
    private String flooringType;

    public void Kitchen(String getSize, int getNumOfCabinets, String getSinkSize, String getFlooringType) {

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumOfCabinets() {
        return numOfCabinets;
    }

    public void setNumOfCabinets(int numOfCabinets) {
        this.numOfCabinets = numOfCabinets;
    }

    public String getSinkSize() {
        return sinkSize;
    }

    public void setSinkSize(String sinkSize) {
        this.sinkSize = sinkSize;
    }

    public String getFlooringType() {
        return flooringType;
    }

    public void setFlooringType(String flooringType) {
        this.flooringType = flooringType;
    }
}
