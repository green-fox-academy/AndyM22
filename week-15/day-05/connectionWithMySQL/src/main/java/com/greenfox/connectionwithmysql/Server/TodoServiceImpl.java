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
        return this.todoRepository.save(todo);
    }

    @Override
    public Object deleteTodoById(Long id) {
        this.todoRepository.deleteById(id);
        return null;
    }

    @Override
    public Object getTodoById(Long id) {
        return this.todoRepository.getOne(id);
    }

    @Override
    public Object editTodo(Todo todo) {
        return this.todoRepository.save(todo);
    }

    @Override
    public List<Todo> findAllByTitle(String title) {
        return this.todoRepository.findAllByTitle(title);
    }

    public List<Todo> getAll() {
        return this.todoRepository.findAll();
    }

}
