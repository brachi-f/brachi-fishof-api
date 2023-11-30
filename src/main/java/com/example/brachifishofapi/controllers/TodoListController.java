package com.example.brachifishofapi.controllers;

import com.example.brachifishofapi.entities.TodoList;
import com.example.brachifishofapi.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoListController {

    @Autowired
    TodoService todoService;

    @GetMapping
    public List<TodoList> getList() {
        return todoService.getList();
    }

    @GetMapping("/{id}")
    public TodoList getById(@PathVariable int id) {
        return todoService.getById(id);
    }

//    @GetMapping("/date/{month}")
//    public List<TodoList> getByDate(@PathVariable int month) {
//        return todoService.getListByDate(month);
//    }

    @PostMapping
    public void postTask(@RequestBody TodoList task) {
        todoService.addTask(task);
    }
    @PutMapping("/{id}")
    public void putTask(@PathVariable int id,@RequestBody TodoList task){
        todoService.updateTask(id,task);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        todoService.delete(id);
    }
}
