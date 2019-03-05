package com.example.demo.Model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {

    @Id
    private int booking_id;
    private int activity_id;
    private int instructor_id;
    private DateTimeFormat start_date_time;
    private DateTimeFormat end_date_time;


    public Booking(int booking_id, int activity_id, int instructor_id, DateTimeFormat start_date_time, DateTimeFormat end_date_time) {
        this.booking_id = booking_id;
        this.activity_id = activity_id;
        this.instructor_id = instructor_id;
        this.start_date_time = start_date_time;
        this.end_date_time = end_date_time;
    }

    public Booking() {
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

    public DateTimeFormat getStart_date_time() {
        return start_date_time;
    }

    public void setStart_date_time(DateTimeFormat start_date_time) {
        this.start_date_time = start_date_time;
    }

    public DateTimeFormat getEnd_date_time() {
        return end_date_time;
    }

    public void setEnd_date_time(DateTimeFormat end_date_time) {
        this.end_date_time = end_date_time;
    }
}
