package com.example.todolist.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.todolist.entity.TodoItemEntity;

@Repository
public interface TodoRepository extends JpaRepository<TodoItemEntity, Integer>{

	List<TodoItemEntity> findByComplete(boolean complete);
	//TodoItemEntity findById(Integer id);
	
	
}
