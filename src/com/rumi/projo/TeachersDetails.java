package com.rumi.projo;

import java.time.LocalDateTime;

public class TeachersDetails {

    private int id;
    private Teacher teacher;
    private int totalPaid;
    private int totalDue;
    private int totalAmount;
    private LocalDateTime lastUpdate;

    public TeachersDetails() {
    }

    public TeachersDetails(Teacher teacher, int totalPaid, int totalDue, int totalAmount, LocalDateTime lastUpdate) {
        this.teacher = teacher;
        this.totalPaid = totalPaid;
        this.totalDue = totalDue;
        this.totalAmount = totalAmount;
        this.lastUpdate = lastUpdate;
    }

    public TeachersDetails(int id, Teacher teacher, int totalPaid, int totalDue, int totalAmount, LocalDateTime lastUpdate) {
        this.id = id;
        this.teacher = teacher;
        this.totalPaid = totalPaid;
        this.totalDue = totalDue;
        this.totalAmount = totalAmount;
        this.lastUpdate = lastUpdate;
    }

    public int getId() {
        return id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getTotalPaid() {
        return totalPaid;
    }

    public int getTotalDue() {
        return totalDue;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
    
}
