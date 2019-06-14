package com.company;

public class Laptop extends Processor{

    private String processor;
    private String memory;
    private String opticalDrive;

    public String getProcessor() {
        return processor;
    }

    public void Laptop(String getProcessor, String getMemory, String getOpticalDrive) {

    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getOpticalDrive() {
        return opticalDrive;
    }

    public void setOpticalDrive(String opticalDrive) {
        this.opticalDrive = opticalDrive;
    }
}
