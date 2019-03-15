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

    @Autowired
    ActivityService AS;
    @Autowired
    BookingService BS;
    @Autowired
    InstructorService IS;

    List<Activity> activity = new ArrayList<>();
    List<Booking> booking = new ArrayList<>();
    List<Instructor> instructor = new ArrayList<>();

    Booking booked = new Booking();


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
        booking.setInstructor_id(0);
    BS.create(booking);
    return "index";

    }

    @GetMapping("/bookingDetails")
    public String bookingDetails(Model model, Model model2){
        booking = BS.readAll();
        model.addAttribute("booking", booking);
        return "bookingDetails";
    }

    @PostMapping("/allocateInstructor")
    public String allocateInstructor(@ModelAttribute Booking bookingObject, Model model){
        booked = bookingObject;
        instructor = IS.readAll();
        model.addAttribute("instructor", instructor);
        return "allocateInstructor";

    }

    @PostMapping("/chooseInstructorForBooking")
    public String chooseInstructorForBooking(@ModelAttribute Instructor instructorObject, Model model){
        booked.setInstructor_id(instructorObject.getInstructor_id());
        BS.update(booked);
        booking = BS.readAll();
        model.addAttribute("booking", booking);
        return "bookingDetails";
    }

    /*@GetMapping("/bookingDevalue = "id")
    public String deleteBooking(Model model, @RequestParam(value ="id") int id){

    }*/

    @GetMapping("/deleteBooking")
    public String deleteBooking(@RequestParam("id") Integer id, @ModelAttribute Booking bookingToDelete, Model model){

        for (int i = 0; i < booking.size(); i++) {
            if(booking.get(i).getBooking_id()==id) bookingToDelete=booking.get(i);
        }

        BS.delete(bookingToDelete);
        model.addAttribute("booking", booking);
        return "redirect:/";
    }


}
