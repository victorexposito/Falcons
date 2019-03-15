package com.example.demo.repository;

import com.example.demo.Model.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EquiptmentRepo implements RepositoryI<Equipment> {

    @Autowired
    JdbcTemplate template;

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
        String sql = "select * from instructor order by last_name";
        RowMapper<Equipment> rowMapper = new BeanPropertyRowMapper<>(Equipment.class);
        List<Equipment> equipment = template.query(sql, rowMapper);

        return equipment;
    }
}
