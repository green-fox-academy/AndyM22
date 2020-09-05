package com.greenfox.connectionwithmysql.Server;

import com.greenfox.connectionwithmysql.Model.Todo;
import com.greenfox.connectionwithmysql.Repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoCustomServiceImpl implements TodoService{

    private TodoRepository todoRepository;

    public TodoCustomServiceImpl (TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> getAll() {
        return this.todoRepository.findAll().stream()
                .filter(t -> t.isDone() == false)
                .collect(Collectors.toList());
    }

    @Override
    public List<Todo> isNotActive() {
        return this.todoRepository.findAll().stream()
                .filter(t -> t.isDone() == false)
                .collect(Collectors.toList());
    }


}
