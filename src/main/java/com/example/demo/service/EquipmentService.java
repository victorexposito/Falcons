package com.example.demo.service;

import com.example.demo.Model.Equipment;
import com.example.demo.repository.EquipmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService implements ServiceI<Equipment> {

    @Autowired
    EquipmentRepo ER = new EquipmentRepo();

    @Override
    public Equipment create(Equipment equipment) {
        return ER.create(equipment);
    }

    @Override
    public Equipment read(Equipment equipment) {
        return null;
    }

    @Override
    public Equipment update(Equipment equipment) {
        return null;
    }

    @Override
    public Equipment delete(Equipment equipment) {
        return null;
    }

    @Override
    public List<Equipment> readAll() {
        return ER.readAll();
    }
}
