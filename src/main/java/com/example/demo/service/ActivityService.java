package com.example.demo.service;

import com.example.demo.Model.Activity;
import com.example.demo.repository.ActivityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActivityService implements ServiceI<Activity> {

    @Autowired
    ActivityRepo AR;

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
        return AR.readAll();

    }
}
