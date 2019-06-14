package com.company;

public class OpticalDrive {
    private String readSpeed;
    private String writeSpeed;
    private String manufacturer;
    private boolean multiformat;

    public void OpticalDrive(String getReadSpeed, String getWriteSpeed, String getManufacturer, boolean getMultiformat) {

    }

    public String getReadSpeed() {
        return readSpeed;
    }

    public void setReadSpeed(String readSpeed) {
        this.readSpeed = readSpeed;
    }

    public String getWriteSpeed() {
        return writeSpeed;
    }

    public void setWriteSpeed(String writeSpeed) {
        this.writeSpeed = writeSpeed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isMultiformat() {
        return multiformat;
    }

    public void setMultiformat(boolean multiformat) {
        this.multiformat = multiformat;
    }
}
