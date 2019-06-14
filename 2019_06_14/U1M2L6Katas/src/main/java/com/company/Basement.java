package com.company;

public class Basement extends Patio{
    private String size;
    private boolean remodeled;
    private String color;

    public void Basement(String getSize, boolean isRemodeled, String getColor) {

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isRemodeled() {
        return remodeled;
    }

    public void setRemodeled(boolean remodeled) {
        this.remodeled = remodeled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
