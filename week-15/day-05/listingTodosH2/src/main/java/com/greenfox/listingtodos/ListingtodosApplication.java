package com.greenfox.listingtodos;

import com.greenfox.listingtodos.Model.Todo;
import com.greenfox.listingtodos.Repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodosApplication implements CommandLineRunner {

    TodoRepository todoRepository;

    public ListingtodosApplication (TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ListingtodosApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
        todoRepository.save(new Todo("I have to learn Object Relational Mapping again!"));
        todoRepository.save(new Todo("Eat lunch"));
    }
}
