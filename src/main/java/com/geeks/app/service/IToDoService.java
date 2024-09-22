package com.geeks.app.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.geeks.app.model.ToDo;

public interface IToDoService {

	List<ToDo> getTodoByUserName(String user);
	
	Optional<ToDo> getTodoById(int id);
	
	void updateTodo(ToDo todo);
	
	void addTodo(String name, String desc, Date targetDate, boolean isDone);
	
	void deleteTodo(int id);
	
	void saveTodo(ToDo todo);
}
