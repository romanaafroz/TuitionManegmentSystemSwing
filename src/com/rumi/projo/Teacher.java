package com.rumi.projo;

public class Teacher {

    private int id;
    private String name;
    private String gender;
    private String fname;
    private Classes cls;
    private String subject;
    private String contract;
    private String address;

    public Teacher() {
    }

    public Teacher(int id) {
        this.id = id;
    }

    public Teacher(int id, String name, String gender, String fname, Classes cls, String subject, String contract, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.fname = fname;
        this.cls = cls;
        this.subject = subject;
        this.contract = contract;
        this.address = address;
    }

    public Teacher(String name, String gender, String fname, Classes cls, String subject, String contract, String address) {
        this.name = name;
        this.gender = gender;
        this.fname = fname;
        this.cls = cls;
        this.subject = subject;
        this.contract = contract;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getFname() {
        return fname;
    }

    public Classes getCls() {
        return cls;
    }

    public String getSubject() {
        return subject;
    }

    public String getContract() {
        return contract;
    }

    public String getAddress() {
        return address;
    }
    

}
