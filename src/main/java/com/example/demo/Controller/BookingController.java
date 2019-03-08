package com.example.demo.Controller;

import com.example.demo.Model.Activity;
import com.example.demo.service.ActivityService;
import com.example.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class BookingController {

    @Autowired
    ActivityService AS;

    @GetMapping("/booking")
    public String booking(Model model){
        List<Activity> activity = AS.readAll();
        model.addAttribute("activity", activity);
        return "booking";
    }


}
