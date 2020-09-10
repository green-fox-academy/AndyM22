package com.greenfox.connectionwithmysql.Server;

import com.greenfox.connectionwithmysql.Model.Assignee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AssigneeService {

    List<Assignee> findAll();

}
