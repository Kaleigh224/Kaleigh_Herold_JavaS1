package com.company;

public class Sedan extends Car{
    private int numDoors;
    private boolean poweredWindows;

    public void Sedan(int getNumDoors, boolean getPoweredWindows) {

    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isPoweredWindows() {
        return poweredWindows;
    }

    public void setPoweredWindows(boolean poweredWindows) {
        this.poweredWindows = poweredWindows;
    }
}