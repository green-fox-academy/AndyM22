package com.greenfox.connectionwithmysql.Server;

import com.greenfox.connectionwithmysql.Model.Assignee;
import com.greenfox.connectionwithmysql.Repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeServiceImpl implements AssigneeService{

    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeServiceImpl(AssigneeRepository assigneeRepository){
        this.assigneeRepository = assigneeRepository;
    }

    @Override
    public List<Assignee> findAll() {
        return this.assigneeRepository.findAll();
    }

}
