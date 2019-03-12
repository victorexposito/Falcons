package com.example.demo.repository;

import com.example.demo.Model.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InstructorRepo implements RepositoryI {

    @Autowired
    JdbcTemplate template;

    @Override
    public Object create(Object o) {
        return null;
    }

    @Override
    public Object read(Object o) {
        return null;
    }

    @Override
    public Object update(Object o) {
        return null;
    }

    @Override
    public Object delete(Object o) {
        return null;
    }

    @Override
    public List<Instructor> readAll() {
        String sql = "select * from instructor order by last_name";
        RowMapper<Instructor> rowMapper = new BeanPropertyRowMapper<>(Instructor.class);
        List<Instructor> instructor = template.query(sql, rowMapper);

        return instructor;
    }
}
