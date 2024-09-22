package com.geeks.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geeks.app.model.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Integer>{
	List<ToDo> findByUserName(String user);

}
