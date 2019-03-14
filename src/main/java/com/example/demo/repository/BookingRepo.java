package com.example.demo.repository;

import com.example.demo.Model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
        String sql ="DELETE FROM booking WHERE booking_id = ?";
        template.update(sql, booking.getBooking_id());
        System.out.println(booking.getBooking_id());
        return booking;
    }

    //this method returns a list of all bookings
    @Override
    public List<Booking> readAll() {
        String sql = "select * from booking order by booking_id";
        RowMapper<Booking> rowMapper = new BeanPropertyRowMapper<>(Booking.class);
        List<Booking> bookings = template.query(sql, rowMapper);
        for(Booking i: bookings){
            System.out.println(i.getBooking_id());
        }
        return bookings;
    }
}
