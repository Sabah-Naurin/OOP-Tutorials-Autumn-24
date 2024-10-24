package com.demo;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private String designation;
    private int salary;
    private LocalDate doj;
    private String gender;

    public Employee(int id, String name, String designation, int salary, LocalDate doj, String gender) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.doj = doj;
        this.gender = gender;
    }

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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.valueOf(this.id);
    }
}
