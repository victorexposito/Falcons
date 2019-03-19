package com.example.demo.Model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {

    //variables
    @Id
    private int booking_id;
    private int activity_id;
    private int instructor_id;
    private int customer_id;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String start_date_time;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String end_date_time;

    //Constructors
    public Booking(int booking_id, int activity_id, int instructor_id, int customer_id, String start_date_time, String end_date_time) {
        this.booking_id = booking_id;
        this.activity_id = activity_id;
        this.instructor_id = instructor_id;
        this.customer_id = customer_id;
        this.start_date_time = start_date_time;
        this.end_date_time = end_date_time;
    }

    public Booking() {
    }

    //Methods
    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public int getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(int activity_id) {
        this.activity_id = activity_id;
    }

    public int getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }

    public String getStart_date_time() {
        return start_date_time;
    }

    public void setStart_date_time(String start_date_time) {
        this.start_date_time = start_date_time;
    }

    public String getEnd_date_time() {
        return end_date_time;
    }

    public void setEnd_date_time(String end_date_time) {
        this.end_date_time = end_date_time;
    }

}
