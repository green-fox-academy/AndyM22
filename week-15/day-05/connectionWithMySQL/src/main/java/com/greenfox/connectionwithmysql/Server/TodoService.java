package com.greenfox.connectionwithmysql.Server;

import com.greenfox.connectionwithmysql.Model.Todo;

import java.util.List;


public interface TodoService {

    List<Todo> getAll();

    List<Todo> isNotActive();

    Object addTodo(Todo todo);

    Object deleteTodoById(Long id);

    Object getTodoById(Long id);

    Object editTodo(Todo todo);

    List<Todo> findAllByTitle(String title);

}
