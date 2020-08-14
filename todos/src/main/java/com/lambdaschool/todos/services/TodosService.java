package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todos;
import com.lambdaschool.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface TodosService
{

    void markComplete(long todoid);

    Todos save(Todos todo);

}
