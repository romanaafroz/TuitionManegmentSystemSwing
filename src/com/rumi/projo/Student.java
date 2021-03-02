/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rumi.projo;

/**
 *
 * @author ASUS
 */
public class Student {

    private int id;
    private String name;
    private Classes cls;
    private Teacher teacher;
    private boolean status;
    private int monthlyFee;
    private String course;
    private String contact;
    private String address;

    public Student() {
    }

    public Student(String name, Classes cls, Teacher teacher, boolean status, int monthlyFee, String course, String contact, String address) {
        this.name = name;
        this.cls = cls;
        this.teacher = teacher;
        this.status = status;
        this.monthlyFee = monthlyFee;
        this.course = course;
        this.contact = contact;
        this.address = address;
    }

    public Student(int id, String name, Classes cls, Teacher teacher, boolean status, int monthlyFee, String course, String contact, String address) {
        this.id = id;
        this.name = name;
        this.cls = cls;
        this.teacher = teacher;
        this.status = status;
        this.monthlyFee = monthlyFee;
        this.course = course;
        this.contact = contact;
        this.address = address;
    }

    public Student(int id) {
        this.id = id;
    }

   

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Classes getCls() {
        return cls;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public boolean isStatus() {
        return status;
    }

    public int getMonthlyFee() {
        return monthlyFee;
    }

    public String getCourse() {
        return course;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    
}
