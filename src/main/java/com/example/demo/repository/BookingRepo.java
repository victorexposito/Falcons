package com.example.demo.repository;

import com.example.demo.Model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BookingRepo implements RepositoryI<Booking> {
    @Autowired
    JdbcTemplate template;

    @Override
    public Booking create(Booking booking) {

        String sql = "insert into booking (booking_id, activity_id, instructor_id, customer_id, start_date_time, end_date_time) Values(?, ?, ?, ?, ?, ?)";
        template.update(sql, booking.getBooking_id(), booking.getActivity_id(), booking.getInstructor_id(), booking.getCustomer_id(), booking.getStart_date_time(), booking.getEnd_date_time());
        return booking;
    }

    @Override
    public Booking read(Booking booking) {
        return null;
    }

    @Override
    public Booking update(Booking booking) {
        return null;
    }

    @Override
    public Booking delete(Booking booking) {
        return null;
    }

    @Override
    public List<Booking> readAll() {
        return null;
    }
}
