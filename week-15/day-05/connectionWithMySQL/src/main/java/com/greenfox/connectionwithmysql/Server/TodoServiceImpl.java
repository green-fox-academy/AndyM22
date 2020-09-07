package com.greenfox.connectionwithmysql.Server;

import com.greenfox.connectionwithmysql.Model.Todo;
import com.greenfox.connectionwithmysql.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> isNotActive() {
        return this.todoRepository.findAll().stream()
                .filter(t -> t.isDone() == false)
                .collect(Collectors.toList());
    }

    @Override
    public Object addTodo(Todo todo) {
        this.todoRepository.save(todo);
        return todo;
    }

    @Override
    public Object deleteTodoById(Long id) {
        this.todoRepository.deleteById(id);
        return null;
    }

    public List<Todo> getAll() {
        return this.todoRepository.findAll();
    }

}
