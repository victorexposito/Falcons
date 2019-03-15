package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EquiptmentRepo implements RepositoryI<Equpitment> {

    @Autowired
    JdbcTemplate template;

    public EquiptmentRepo() {
        super();
    }

    @Override
    public Equpitment create(Equpitment equpitment) {
        return null;
    }

    @Override
    public Equpitment read(Equpitment equpitment) {
        return null;
    }

    @Override
    public Equpitment update(Equpitment equpitment) {
        return null;
    }

    @Override
    public Equpitment delete(Equpitment equpitment) {
        return null;
    }

    @Override
    public List<Equpitment> readAll() {
        return null;
    }
}
