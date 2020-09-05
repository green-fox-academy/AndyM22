package com.greenfox.connectionwithmysql.Repository;

import com.greenfox.connectionwithmysql.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
