package com.example.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.todolist.controller.TodoBO;
import com.example.todolist.controller.model.TodoItem;

@RestController
@RequestMapping("/todos")
public class ToDoController {

	
	@Autowired
	private TodoBO todoBO;
	
	@GetMapping
	public List<TodoItem> getTodoItems(@RequestParam(required=false) Boolean complete){
		if(null == complete) {
			return todoBO.getTodoItems();
		}else {
			return todoBO.getTodoItems(complete);
		}
	}
	
	@PostMapping
	public TodoItem addTodoItem(@RequestBody TodoItem todoItem ){
		return todoBO.addTodoItem(todoItem);
		
	}
	@DeleteMapping("/{id}")
	public void deleteTodoItem(@PathVariable Integer id) {
		todoBO.deleteTodoItem(id);
	}
	@PostMapping("/todo/id/{id}/status/{status}")
	public void changeTodoItemStatus(@PathVariable Integer id, @PathVariable String status){
		
		  todoBO.changeTodoItemStatus(id,status);;
		
	}
	
}
