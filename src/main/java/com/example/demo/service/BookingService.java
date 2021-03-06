package com.example.demo.service;

import com.example.demo.Model.Booking;
import com.example.demo.repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService implements ServiceI<Booking> {

    @Autowired
    BookingRepo BR = new BookingRepo();

    @Override
    public Booking create(Booking booking) {
        return BR.create(booking);

    }

    @Override
    public Booking read(Booking booking) {
        return null;
    }

    @Override
    public Booking update(Booking booking) {

        return BR.update(booking);
    }

    @Override
    public Booking delete(Booking booking) {
        return BR.delete(booking);
    }

    @Override
    public List<Booking> readAll() {
        return BR.readAll();
    }
}
