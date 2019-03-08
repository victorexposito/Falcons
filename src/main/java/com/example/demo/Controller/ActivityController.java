package com.example.demo.Controller;

import com.example.demo.Model.Activity;
import com.example.demo.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ActivityController {

    @Autowired
    ActivityService AS;

    @GetMapping("/activities")
       public String activities(Model model){
        List<Activity> activity = AS.readAll();
        model.addAttribute("activity" ,activity);
        return "activities";
    }


}


