package com.greenfox.connectionwithmysql.Repository;

import com.greenfox.connectionwithmysql.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    @Query("SELECT title FROM Todo title WHERE title.title LIKE %:title%")
    List<Todo> findAllByTitle(String title);

}
