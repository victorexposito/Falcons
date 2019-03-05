package com.example.demo.service;

import com.example.demo.Model.Booking;
import com.example.demo.repository.BookingRepo;

import java.util.List;

public class BookingService implements ServiceI<Booking> {

    BookingRepo BR = new BookingRepo();

    @Override
    public Booking create(Booking booking) {
        BR.create(booking);
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
