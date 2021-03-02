
package com.rumi.projo;


public class User {
     private int id;
    private String name;
    private String userid;
    private String password;
    private String type;

    public User() {
    }

    public User(int id, String name, String userid, String password, String type) {
        this.id = id;
        this.name = name;
        this.userid = userid;
        this.password = password;
        this.type = type;
    }

    public User(String name, String userid, String password, String type) {
        this.name = name;
        this.userid = userid;
        this.password = password;
        this.type = type;
    }
    
    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserid() {
        return userid;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }

    
}
