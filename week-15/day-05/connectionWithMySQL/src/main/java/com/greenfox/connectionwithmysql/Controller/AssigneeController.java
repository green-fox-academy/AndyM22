package com.greenfox.connectionwithmysql.Controller;

import com.greenfox.connectionwithmysql.Server.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

    AssigneeService assigneeService;

    @Autowired
    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("assignees", this.assigneeService.findAll());
        return "assignees";
    }

}
