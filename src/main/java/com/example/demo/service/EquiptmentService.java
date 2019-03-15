package com.example.demo.service;

import com.example.demo.Model.Equipment;
import com.example.demo.repository.EquiptmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquiptmentService implements ServiceI<Equipment> {

    @Autowired
    EquiptmentRepo ER = new EquiptmentRepo();

    @Override
    public Equipment create(Equipment equiptment) {
        return null;
    }

    @Override
    public Equipment read(Equipment equiptment) {
        return null;
    }

    @Override
    public Equipment update(Equipment equiptment) {
        return null;
    }

    @Override
    public Equipment delete(Equipment equiptment) {
        return null;
    }

    @Override
    public List<Equipment> readAll() {
        return ER.readAll();
    }
}
