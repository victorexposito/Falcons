package com.example.demo.repository;

import com.example.demo.Model.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ActivityRepo implements RepositoryI<Activity>{

    @Autowired
    JdbcTemplate template;

    @Override
    public Activity create(Activity activity) {
        return null;
    }

    @Override
    public Activity read(Activity activity) {
        return null;
    }

    @Override
    public Activity update(Activity activity) {
        return null;
    }

    @Override
    public Activity delete(Activity activity) {
        return null;
    }

    @Override
    public List<Activity> readAll() {
        String sql = "select * from activity";
        RowMapper<Activity> rowMapper = new BeanPropertyRowMapper<>(Activity.class);
        List<Activity> activities = template.query(sql, rowMapper);
        return activities;
    }
}
