package com.example.demo.services;

import com.example.demo.models.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    public List<ToDo> list=new ArrayList<>();
    public ToDo create(ToDo todo)
    {
        list.add(todo);
        return todo;
    }

    public List<ToDo> getList() {
        return list;
    }
}
