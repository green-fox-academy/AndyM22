package com.greenfox.listingtodos.Controller;

import com.greenfox.listingtodos.Repository.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

    TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping({"/", "/list"})
    //@ResponseBody //vrátí jen string, neodkazuje na html template
    public String list(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }

}
