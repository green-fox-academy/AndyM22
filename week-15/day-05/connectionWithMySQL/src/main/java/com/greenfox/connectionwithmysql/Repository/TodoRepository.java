package com.greenfox.connectionwithmysql.Repository;

import com.greenfox.connectionwithmysql.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
