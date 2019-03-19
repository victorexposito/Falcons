package com.example.demo.Controller;

import com.example.demo.Model.Activity;
import com.example.demo.Model.Booking;
import com.example.demo.Model.Instructor;
import com.example.demo.service.ActivityService;
import com.example.demo.service.BookingService;
import com.example.demo.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookingController {

    //Service and repo
    @Autowired
    ActivityService AS;
    @Autowired
    BookingService BS;
    @Autowired
    InstructorService IS;

    //Lists
    List<Activity> activities = new ArrayList<>();
    List<Booking> bookings = new ArrayList<>();
    List<Instructor> instructors = new ArrayList<>();

    //current booking object
    Booking booked = new Booking();

    @GetMapping("/booking")
    public String booking(Model model){
        activities = AS.readAll();
        model.addAttribute("activity", activities);
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
        booking.setInstructor_id(0);
    BS.create(booking);
    return "index";

    }

    @GetMapping("/bookingDetails")
    public String bookingDetails(Model model, Model model2){
        bookings = BS.readAll();
        model.addAttribute("booking", bookings);
        return "bookingDetails";
    }

    @PostMapping("/allocateInstructor")
    public String allocateInstructor(@ModelAttribute Booking bookingObject, Model model){
        booked = bookingObject;
        instructors = IS.readAll();
        model.addAttribute("instructor", instructors);
        return "allocateInstructor";

    }

    @PostMapping("/chooseInstructorForBooking")
    public String chooseInstructorForBooking(@ModelAttribute Instructor instructorObject, Model model){
        booked.setInstructor_id(instructorObject.getInstructor_id());
        BS.update(booked);
        bookings = BS.readAll();
        model.addAttribute("booking", bookings);
        return "bookingDetails";
    }


    @GetMapping("/deleteBooking")
    public String deleteBooking(@RequestParam("id") Integer id, @ModelAttribute Booking bookingToDelete, Model model){

        for (int i = 0; i < bookings.size(); i++) {
            if(bookings.get(i).getBooking_id()==id) bookingToDelete= bookings.get(i);
        }

        BS.delete(bookingToDelete);
        model.addAttribute("booking", bookings);
        return "redirect:/";
    }


}
