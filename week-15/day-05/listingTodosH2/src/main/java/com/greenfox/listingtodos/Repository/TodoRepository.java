package com.greenfox.listingtodos.Repository;

import com.greenfox.listingtodos.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
