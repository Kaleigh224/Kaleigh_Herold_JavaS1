package com.company.KaleighHeroldU1M5Summative.model;

import java.util.Objects;

public class Book {

    private int id;
    private String isbn;
    private String publish_date;
    private int author_id;
    private String title;
    private int publisher_id;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(int publisher_id) {
        this.publisher_id = publisher_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getId() == book.getId() &&
                getAuthor_id() == book.getAuthor_id() &&
                getPublisher_id() == book.getPublisher_id() &&
                Double.compare(book.getPrice(), getPrice()) == 0 &&
                Objects.equals(getIsbn(), book.getIsbn()) &&
                Objects.equals(getPublish_date(), book.getPublish_date()) &&
                Objects.equals(getTitle(), book.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getIsbn(), getPublish_date(), getAuthor_id(), getTitle(), getPublisher_id(), getPrice());
    }
}
