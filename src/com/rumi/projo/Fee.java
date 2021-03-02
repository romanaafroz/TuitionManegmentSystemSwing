package com.rumi.projo;

import java.util.Date;

public class Fee {

    private int id;
    private Student studentId;
    private String name;
    private String cls;
    private int year;
    private int month;
    private int amount;

    public Fee() {
    }

    public Fee(int id) {
        this.id = id;
    }

    public Fee(Student studentId) {
        this.studentId = studentId;
    }
    

    public Fee(int id, Student studentId, String name, String cls, int year, int month, int amount) {
        this.id = id;
        this.studentId = studentId;
        this.name = name;
        this.cls = cls;
        this.year = year;
        this.month = month;
        this.amount = amount;
    }

    public Fee(Student studentId, String name, String cls, int year, int month, int amount) {
        this.studentId = studentId;
        this.name = name;
        this.cls = cls;
        this.year = year;
        this.month = month;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Student getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getCls() {
        return cls;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getAmount() {
        return amount;
    }

   

    
   
}
