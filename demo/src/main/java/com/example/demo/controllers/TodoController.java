package com.example.demo.controllers;

import com.example.demo.models.ToDo;
import com.example.demo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    public TodoService todoservice;
    //cretae todo
    @PostMapping
    public ToDo createTodo(@RequestBody ToDo todo){
               //creating
              return todoservice.create(todo);
    }
    //get todo
    @GetMapping
    public List<ToDo> getAll()
    {
        return todoservice.getList();
    }
}
