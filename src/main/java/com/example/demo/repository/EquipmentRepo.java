package com.example.demo.repository;

import com.example.demo.Model.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EquipmentRepo implements RepositoryI<Equipment> {

    @Autowired
    JdbcTemplate template;

    @Override
    public Equipment create(Equipment equipment) {
        return null;
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
        String sql = "select * from equipment order by name";
        RowMapper<Equipment> rowMapper = new BeanPropertyRowMapper<>(Equipment.class);
        List<Equipment> equipment = template.query(sql, rowMapper);

        return equipment;
    }
}
