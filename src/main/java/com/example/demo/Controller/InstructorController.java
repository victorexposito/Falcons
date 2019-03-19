package com.example.demo.Controller;

import com.example.demo.Model.Instructor;
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
public class InstructorController {

    //Service and repos
    @Autowired
    InstructorService IS;

    //Instructor list
    List<Instructor> instructors = new ArrayList<>();

    @GetMapping("/instructor")
    public String addInstructor(Model model){
        instructors = IS.readAll();
        model.addAttribute("instructor", instructors);
        return "instructor";
    }

    @PostMapping("/createInstructor")
    public String createInstructor(@ModelAttribute Instructor i, Model model){
        IS.create(i);
        instructors = IS.readAll();
        model.addAttribute("instructor", instructors);
        return "instructor";
    }

    @GetMapping("/editInstructor")
    public String editInstructor(@RequestParam("id") Integer id, Model model){
        Instructor instructorToUpdate = new Instructor();
        for(Instructor i : instructors){
            if(i.getInstructor_id()==id){
                instructorToUpdate = i;
            }
        }
        model.addAttribute("instructor", instructorToUpdate);
        return "editInstructor";
    }
    @PostMapping("/editInstructorDo")
    public String editInstructorDo(@ModelAttribute Instructor instructorToEdit, Model model){
        IS.update(instructorToEdit);
        instructors = IS.readAll();
        model.addAttribute("instructor", instructors);
        return "instructor";
    }

}
