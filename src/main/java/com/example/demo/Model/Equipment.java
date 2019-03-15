package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Equipment {

    @Id
    private int equipment_id;
    private String name;
    private int quantity;
    private String comment;

    public Equipment(int equipment_id, String name, int quantity, String comment) {
        this.equipment_id = equipment_id;
        this.name = name;
        this.quantity = quantity;
        this.comment = comment;
    }

    public Equipment() {
    }

    public int getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(int equipment_id) {
        this.equipment_id = equipment_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
