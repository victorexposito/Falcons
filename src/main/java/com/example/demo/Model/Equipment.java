package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Equipment {

    @Id
    private int equipmentId;
    private String name;
    private int quantity;
    private String comment;

    public Equipment(int equipmentId, String name, int quantity, String comment) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.quantity = quantity;
        this.comment = comment;
    }

    public Equipment() {
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
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
