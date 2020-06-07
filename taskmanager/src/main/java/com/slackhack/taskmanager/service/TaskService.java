package com.slackhack.taskmanager.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slackhack.taskmanager.model.Task;
import com.slackhack.taskmanager.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;
	
	public List<Task> getTasks(){
		return taskRepository.findAll();
	}
	
	@Transactional
	public List<Task> addTask(Task task){
		taskRepository.save(task);
		return taskRepository.findAll();
	}
}
