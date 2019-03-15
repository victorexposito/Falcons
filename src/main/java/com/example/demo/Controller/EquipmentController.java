package com.example.demo.Controller;

import com.example.demo.Model.Equipment;
import com.example.demo.repository.EquipmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EquipmentController {

    @Autowired
    EquipmentRepo ER;

    List<Equipment> equipment = new ArrayList<>();


    @GetMapping("/equipment")
    public String readEquipment(Model model){
        equipment = ER.readAll();
        model.addAttribute("equipment", equipment);
        return "equipment";
    }

    @PostMapping("/addEquipment")
    public String addEquipment(@ModelAttribute Equipment equipment){
        equipment.setEquipment_id(0);
        ER.create(equipment);
        return "equipment";
    }
}
