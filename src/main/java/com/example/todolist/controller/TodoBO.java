package com.example.todolist.controller;

import java.util.List;

import com.example.todolist.controller.model.TodoItem;

public interface TodoBO {
	List<TodoItem> getTodoItems();

	TodoItem addTodoItem(TodoItem todoItem);

	void deleteTodoItem(Integer id);

	List<TodoItem> getTodoItems(boolean complete);

	void changeTodoItemStatus(Integer id, String status);
}

