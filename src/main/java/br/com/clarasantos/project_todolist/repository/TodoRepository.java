package br.com.clarasantos.project_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.clarasantos.project_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
