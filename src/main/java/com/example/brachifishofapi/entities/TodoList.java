package com.example.brachifishofapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
public class TodoList {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    String desctiption;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate date;

    public TodoList(String desctiption, LocalDate date) {
        this.desctiption = desctiption;
        this.date = date;
    }

    public void setDesctiption(String desctiption) {
        this.desctiption = desctiption;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public TodoList() {
    }


    public String getDesctiption() {
        return desctiption;
    }

    public LocalDate getDate() {
        return date;
    }


    public Integer getId() {
        return id;
    }
}
