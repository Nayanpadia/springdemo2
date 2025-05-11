package com.example.jpa.jpahibernate.entity;

public class Student {

    private String FirstName;
    private String LastName;

    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.FirstName = firstName;
        this.LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }
}
