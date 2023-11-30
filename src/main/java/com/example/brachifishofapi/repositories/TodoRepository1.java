package com.example.brachifishofapi.repositories;

import com.example.brachifishofapi.entities.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class TodoRepository1 {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<TodoList> getTodoesByMonth(int month) {
        List<TodoList> list = new ArrayList<>();
        List<Map<String, Object>> rows = jdbcTemplate.queryForList("select* from TodoList where MONTH(date) ==" + month + "");
        for (Map<String, Object> row : rows) {
            TodoList task = new TodoList((String) row.get("name"), (LocalDate) row.get("date"));
            list.add(task);
        }
        return list;
    }

}
