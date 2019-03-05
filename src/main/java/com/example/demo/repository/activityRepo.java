package com.example.demo.repository;

import com.example.demo.Model.Activity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class activityRepo implements RepositoryI<Activity>{
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

        return null;
    }
}
