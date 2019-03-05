package com.example.demo.repository;

import com.example.demo.Model.Activity;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ActivityRepoTest {

    ActivityRepo AR = new ActivityRepo();

    @Test
    public void create() {
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void readAll() {
        List<Activity> list = new ArrayList<>();
        Activity a1 = new Activity(1, 200, "paintball", 120);
        list.add(a1);
        assertEquals("Vi får en liste tilbage med activities",list, AR.readAll());
    }
}