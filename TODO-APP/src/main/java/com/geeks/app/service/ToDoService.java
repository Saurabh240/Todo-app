package com.geeks.app.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geeks.app.model.ToDo;
import com.geeks.app.repository.ToDoRepository;

@Service
public class ToDoService implements IToDoService{
    
	@Autowired
	private ToDoRepository toDoRepository;
	@Override
	public List<ToDo> getTodoByUserName(String user) {
		
		return toDoRepository.findByUserName(user);
	}

	@Override
	public Optional<ToDo> getTodoById(int id) {
		// TODO Auto-generated method stub
		return toDoRepository.findById(id);
	}

	@Override
	public void updateTodo(ToDo todo) {
		toDoRepository.save(todo);
		
	}

	@Override
	public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
		toDoRepository.save(new ToDo(name,desc,targetDate,isDone));
		
	}

	@Override
	public void deleteTodo(int id) {
		Optional<ToDo> todo = toDoRepository.findById(id);
		if (todo.isPresent()) {
            toDoRepository.delete(todo.get());
        }
		
	}

	@Override
	public void saveTodo(ToDo todo) {
		toDoRepository.save(todo);
		
	}

}
