package com.company;

public class Bathroom extends Kitchen{
    private String size;
    private String color;
    private boolean hasTub;
    private String showerSize;

    public void Bathroom(String getSize, String getColor, boolean getHasTub, String getShowerSize) {

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasTub() {
        return hasTub;
    }

    public void setHasTub(boolean hasTub) {
        this.hasTub = hasTub;
    }

    public String getShowerSize() {
        return showerSize;
    }

    public void setShowerSize(String showerSize) {
        this.showerSize = showerSize;
    }
}
