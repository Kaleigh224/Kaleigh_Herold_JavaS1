package com.company.KaleighHeroldU1M5Summative.model;

import java.util.Objects;

public class Publisher {

    private int id;
    private String name;
    private String street;
    private String city;
    private String state;
    private String postal_code;
    private String phone;
    private String email;
    private String book_id;
    private String author_id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return id == publisher.id &&
                Objects.equals(getName(), publisher.getName()) &&
                Objects.equals(getStreet(), publisher.getStreet()) &&
                Objects.equals(getCity(), publisher.getCity()) &&
                Objects.equals(getState(), publisher.getState()) &&
                Objects.equals(getPostal_code(), publisher.getPostal_code()) &&
                Objects.equals(getPhone(), publisher.getPhone()) &&
                Objects.equals(getEmail(), publisher.getEmail()) &&
                Objects.equals(getBook_id(), publisher.getBook_id()) &&
                Objects.equals(getAuthor_id(), publisher.getAuthor_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getName(), getStreet(), getCity(), getState(), getPostal_code(), getPhone(), getEmail(), getBook_id(), getAuthor_id());
    }
}
