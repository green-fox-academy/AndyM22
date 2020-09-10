package com.greenfox.connectionwithmysql.Repository;

import com.greenfox.connectionwithmysql.Model.Assignee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AssigneeRepository extends JpaRepository<Assignee, Long> {



}
