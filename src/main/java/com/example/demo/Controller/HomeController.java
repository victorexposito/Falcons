package com.example.demo.Controller;

import com.example.demo.Model.*;
import com.example.demo.service.ActivityService;
import com.example.demo.service.ServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ServiceI activityService;

    @GetMapping("/")
    public String home(Model model){

        return "index";
    }

    @GetMapping("/activities")
    public String showAllActivities(Model model){
        List<Activity> activities= activityService.readAll();
        model.addAttribute("activityList", activities);

        return "activities";
    }


}
