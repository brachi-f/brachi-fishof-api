package com.example.brachifishofapi.repositories;

import com.example.brachifishofapi.entities.TodoList;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface TodoRepository extends CrudRepository<TodoList, Integer> {

}
