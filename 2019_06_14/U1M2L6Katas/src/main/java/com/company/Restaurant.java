package com.company;

public class Restaurant extends VendingMachine{
    private String sodaPop;
    private String burgers;
    private String wings;
    private String beer;

    public void Restaurant(String getSodaPop, String getBurgers, String getWings, String getBeer) {

    }

    public String getSodaPop() {
        return sodaPop;
    }

    public void setSodaPop(String sodaPop) {
        this.sodaPop = sodaPop;
    }

    public String getBurgers() {
        return burgers;
    }

    public void setBurgers(String burgers) {
        this.burgers = burgers;
    }

    public String getWings() {
        return wings;
    }

    public void setWings(String wings) {
        this.wings = wings;
    }

    public String getBeer() {
        return beer;
    }

    public void setBeer(String beer) {
        this.beer = beer;
    }
}
