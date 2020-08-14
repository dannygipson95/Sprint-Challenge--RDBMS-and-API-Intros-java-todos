package com.lambdaschool.todos.services;

import com.lambdaschool.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "todoService")
public class TodoServiceImpl implements TodosService{
    @Autowired
    TodoRepository todorepos;

    @Override
    public void markComplete(long todoid) {

    }
}
