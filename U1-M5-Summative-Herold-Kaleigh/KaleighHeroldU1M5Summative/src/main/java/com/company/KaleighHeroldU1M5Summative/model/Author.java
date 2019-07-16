package com.company.KaleighHeroldU1M5Summative.model;

import javax.validation.constraints.Max;
import java.util.Objects;

public class Author {
    private int id;
    private String first_name;
    private String last_name;
    private String street;
    private String city;
    private String state;
    private String postal_code;
    private String phone;
    private String email;
    private int book_id;
    private int publisher_id;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(int publisher_id) {
        this.publisher_id = publisher_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return getId() == author.getId() &&
                getBook_id() == author.getBook_id() &&
                getPublisher_id() == author.getPublisher_id() &&
                Objects.equals(getFirst_name(), author.getFirst_name()) &&
                Objects.equals(getLast_name(), author.getLast_name()) &&
                Objects.equals(getStreet(), author.getStreet()) &&
                Objects.equals(getCity(), author.getCity()) &&
                Objects.equals(getState(), author.getState()) &&
                Objects.equals(getPostal_code(), author.getPostal_code()) &&
                Objects.equals(getPhone(), author.getPhone()) &&
                Objects.equals(getEmail(), author.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirst_name(), getLast_name(), getStreet(), getCity(), getState(), getPostal_code(), getPhone(), getEmail(), getBook_id(), getPublisher_id());
    }
}
