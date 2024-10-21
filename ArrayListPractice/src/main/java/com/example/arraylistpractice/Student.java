package com.example.arraylistpractice;

public class Student {
    private String name;
    private String major;
    private int id;

    // We created Two Constructors. Known as "Constructor Overloading"
    public Student(String name, String major, int id) {
        this.name = name;
        this.major = major;
        this.id = id;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
