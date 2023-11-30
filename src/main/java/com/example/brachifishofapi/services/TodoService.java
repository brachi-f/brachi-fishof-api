package com.example.brachifishofapi.services;

import com.example.brachifishofapi.entities.TodoList;
import com.example.brachifishofapi.repositories.TodoRepository;
import com.example.brachifishofapi.repositories.TodoRepository1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;
//    @Autowired
//    TodoRepository1 todoRepository1;

    public List<TodoList> getList() {
        return (List<TodoList>) todoRepository.findAll();
    }
//    public List<TodoList> getListByDate(int month){
//        return (List<TodoList>) todoRepository1.getTodoesByMonth(month);
//    }
    public TodoList getById(int id) {
        return todoRepository.findById(id).get();
    }
    public void addTask(TodoList task){
        todoRepository.save(task);
    }
    public void updateTask(int id,TodoList task){
        todoRepository.deleteById(id);
        todoRepository.save(task);
    }
    public void delete(int id){
        todoRepository.deleteById(id);
    }

}
