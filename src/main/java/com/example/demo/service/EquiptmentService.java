package com.example.demo.service;

import com.example.demo.repository.EquiptmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquiptmentService implements ServiceI<Equiptment> {

    @Autowired
    EquiptmentRepo ER = new EquiptmentRepo();

    @Override
    public Equiptment create(Equiptment equiptment) {
        return null;
    }

    @Override
    public Equiptment read(Equiptment equiptment) {
        return null;
    }

    @Override
    public Equiptment update(Equiptment equiptment) {
        return null;
    }

    @Override
    public Equiptment delete(Equiptment equiptment) {
        return null;
    }

    @Override
    public List<Equiptment> readAll() {
        return null;
    }
}
