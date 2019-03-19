package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Activity {

    //Variables
    @Id
    private int activity_id;
    private double price;
    private String name;
    private int duration;

    //Constructors
    public Activity(int activity_id, double price, String name, int duration) {
        this.activity_id = activity_id;
        this.price = price;
        this.name = name;
        this.duration = duration;
    }

    public Activity() {
    }

    //Methods
    public int getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(int activity_id) {
        this.activity_id = activity_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
