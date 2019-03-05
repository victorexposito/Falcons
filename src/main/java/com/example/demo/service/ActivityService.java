package com.example.demo.service;

import com.example.demo.Model.Activity;
import com.example.demo.repository.ActivityRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActivityService implements ServiceI<Activity> {

    ActivityRepo AR = new ActivityRepo();

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
        List<Activity> activities = AR.readAll();
        return activities;
    }
}
