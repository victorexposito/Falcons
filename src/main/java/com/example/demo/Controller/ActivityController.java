package com.example.demo.Controller;

import com.example.demo.Model.Activity;
import com.example.demo.repository.ActivityRepo;
import com.example.demo.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ActivityController {

    @Autowired
    ActivityService AS;
    ActivityRepo AR;

    List<Activity> activity =new ArrayList<>();

    @GetMapping("/activities")
       public String activities(Model model){
        activity = AS.readAll();
        model.addAttribute("activity" ,activity);
        return "activities";
    }


    @GetMapping("/activities2")
        public String activities2(@ModelAttribute Activity activityObject, Model model){
        activity.clear();
        activity.add(AS.read(activityObject));
        model.addAttribute("activity", activity);
        return "activities";
    }


}


