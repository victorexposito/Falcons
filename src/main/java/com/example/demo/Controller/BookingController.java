package com.example.demo.Controller;

import com.example.demo.Model.Activity;
import com.example.demo.Model.Booking;
import com.example.demo.service.ActivityService;
import com.example.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookingController {

    @Autowired
    ActivityService AS;
    @Autowired
    BookingService BS;

    List<Activity> activity = new ArrayList<>();
    List<Booking> booking = new ArrayList<>();


    @GetMapping("/booking")
    public String booking(Model model){
        activity = AS.readAll();
        model.addAttribute("activity", activity);
        return "booking";
    }

    @PostMapping("/bookActivity")
    public String bookActivity(@ModelAttribute Activity activity, Model model){
        List<Booking> booking = new ArrayList<>();
        Booking bookingObject = new Booking();
        bookingObject.setActivity_id(activity.getActivity_id());
        booking.add(bookingObject);
        model.addAttribute("booking", booking);
        return "booking";
    }

    @PostMapping("/createBooking")
    public String createBooking(@ModelAttribute Booking booking){
    BS.create(booking);
    return "index";

    }

    @GetMapping("/bookingDetails")
    public String bookingDetails(Model model){
        booking = BS.readAll();
        model.addAttribute("booking", booking);
        return "bookingDetails";
    }


}
