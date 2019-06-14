package com.company;

public class House extends Basement{
    private boolean hasBasement;
    private int numOfBathrooms;
    private String kitchen;
    private boolean patio;

    public void House(boolean getBasement, int getNumOfBathrooms, String getKitchen, boolean getPatio) {

    }

    public boolean isHasBasement() {
        return hasBasement;
    }

    public void setHasBasement(boolean hasBasement) {
        this.hasBasement = hasBasement;
    }

    public int getNumOfBathrooms() {
        return numOfBathrooms;
    }

    public void setNumOfBathrooms(int numOfBathrooms) {
        this.numOfBathrooms = numOfBathrooms;
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public boolean isPatio() {
        return patio;
    }

    public void setPatio(boolean patio) {
        this.patio = patio;
    }
}
