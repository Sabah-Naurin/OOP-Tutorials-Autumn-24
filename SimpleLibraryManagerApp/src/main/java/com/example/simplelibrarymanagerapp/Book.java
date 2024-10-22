package com.example.simplelibrarymanagerapp;

public class Book {
    private String name;
    private int id;
    private String genre;
    private int price;
    private String condition;

    public Book(String name, int id, String genre, int price, String condition) {
        this.name = name;
        this.id = id;
        this.genre = genre;
        this.price = price;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
