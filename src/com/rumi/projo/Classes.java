package com.rumi.projo;

public class Classes {

    private int id;
    private String cls;

    public Classes() {
    }

    public Classes(int id) {
        this.id = id;
    }
    

    public Classes(String cls) {
        this.cls = cls;
    }

    public Classes(int id, String cls) {
        this.id = id;
        this.cls = cls;
    }

    public int getId() {
        return id;
    }

    public String getCls() {
        return cls;
    }

    
}
