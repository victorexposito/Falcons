package com.example.demo.repository;

import com.example.demo.Model.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InstructorRepo implements RepositoryI<Instructor> {

    @Autowired
    JdbcTemplate template;

    @Override
    public Instructor create(Instructor instructor) {
        String sql = "INSERT INTO instructor (instructor_id, first_name, last_name, phone_number) VALUES(?,?,?,?)";
        template.update(sql, instructor.getInstructor_id(), instructor.getFirst_name(), instructor.getLast_name(), instructor.getPhone_number());
        return instructor;
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
    public List<Instructor> readAll() {
        String sql = "select * from instructor order by last_name";
        RowMapper<Instructor> rowMapper = new BeanPropertyRowMapper<>(Instructor.class);
        List<Instructor> instructor = template.query(sql, rowMapper);

        return instructor;
    }
}
