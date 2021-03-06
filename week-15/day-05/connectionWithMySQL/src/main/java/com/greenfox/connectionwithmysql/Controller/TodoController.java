package com.greenfox.connectionwithmysql.Controller;

import com.greenfox.connectionwithmysql.Model.Todo;
import com.greenfox.connectionwithmysql.Repository.TodoRepository;
import com.greenfox.connectionwithmysql.Server.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    TodoRepository todoRepository;
    TodoService todoService;

    @Autowired
    public TodoController(TodoRepository todoRepository, TodoService todoService) {
        this.todoRepository = todoRepository;
        this.todoService = todoService;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model, @RequestParam(required = false) Boolean isActive) {
        if (isActive == null) {
            model.addAttribute("todos", todoService.getAll());
        } else {
            model.addAttribute("todos", todoService.isNotActive());
        }
        return "todolist";
    }

    @GetMapping("/add")
    public String todoForm(Model model) {
        model.addAttribute("addTodo", new Todo());
        return "addNewTodo";
    }

    @PostMapping("/add")
    public String todoSubmit(@ModelAttribute("addTodo") Todo todo, Model model) {
        model.addAttribute("addTodo", todoService.addTodo(todo));
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/delete")
    public String deleteById(@PathVariable("id") Long id) {
        this.todoService.deleteTodoById(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("editTodo", this.todoService.getTodoById(id));
        return "editTodo";
    }

    @PostMapping("/{id}/edit")
    public String submitEditForm(@ModelAttribute("editTodo") Todo todo, Model model) {
        model.addAttribute("editTodo", this.todoService.editTodo(todo));
        return "redirect:/todo/list";
    }

   /* @GetMapping("/search")
    public String getSearch(Model model, @RequestParam String title){
        model.addAttribute("title", todoService.findAllByTitle(title));
        return "todolist";
    }*/

    @PostMapping("/search")
    public String postSearch(@RequestParam String byTitle, Model model){
        model.addAttribute("todos", todoService.findAllByTitle(byTitle));
        return "todolist";
    }

}
