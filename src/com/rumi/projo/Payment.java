package com.rumi.projo;

public class Payment {

    private int id;
    private Teacher teacher;
    private int month;
    private int year;
    private int salary;

    public Payment() {
    }

    public Payment(int id, Teacher teacher, int month, int year, int salary) {
        this.id = id;
        this.teacher = teacher;
        this.month = month;
        this.year = year;
        this.salary = salary;
    }

    public Payment(Teacher teacher, int month, int year, int salary) {
        this.teacher = teacher;
        this.month = month;
        this.year = year;
        this.salary = salary;
    }

    public Payment(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getSalary() {
        return salary;
    }
    

   
    
}
