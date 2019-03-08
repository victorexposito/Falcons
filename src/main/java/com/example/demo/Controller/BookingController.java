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
    BookingService BS = new BookingService();

    @Autowired
    ActivityService AS = new ActivityService();

    List<Activity> activities = AS.readAll();

    @GetMapping("/Booking")
    public String booking(Model model){
    model.addAttribute("activity", activities);
    return "booking";
    }


}
