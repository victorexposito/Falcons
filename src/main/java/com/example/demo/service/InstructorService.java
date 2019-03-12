package com.example.demo.service;

import com.example.demo.Model.Instructor;
import com.example.demo.repository.InstructorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService implements ServiceI<Instructor> {

    @Autowired
    InstructorRepo IR;

    @Override
    public Instructor create(Instructor instructor) {
        return IR.create(instructor);
    }

    @Override
    public Instructor read(Instructor instructor) {
        return null;
    }

    @Override
    public Instructor update(Instructor instructor) {
        return null;
    }

    @Override
    public Instructor delete(Instructor instructor) {
        return null;
    }

    @Override
    public List readAll() {
        return IR.readAll();
    }
}
