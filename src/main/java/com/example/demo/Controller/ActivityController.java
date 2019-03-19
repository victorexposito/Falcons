package com.example.demo.Controller;

import com.example.demo.Model.Activity;
import com.example.demo.repository.ActivityRepo;
import com.example.demo.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ActivityController {

    //Service and Repo
    @Autowired
    ActivityService AS;
    ActivityRepo AR;

    //Activity list
    List<Activity> activities = new ArrayList<>();

    @GetMapping("/activities")
    public String activities(Model model) {
        activities = AS.readAll();
        model.addAttribute("activity", activities);
        return "activities";
    }

}


