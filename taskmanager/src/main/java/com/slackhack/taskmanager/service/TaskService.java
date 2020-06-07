package com.slackhack.taskmanager.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slackhack.taskmanager.model.Task;
import com.slackhack.taskmanager.model.User;
import com.slackhack.taskmanager.repository.TaskRepository;
import com.slackhack.taskmanager.repository.UserRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public List<Task> getTasks(){
		return taskRepository.findAll();
	}
	
	@Transactional
	public List<Task> addTask(long userId,Task task){
		User user = userRepository.findById(userId);
		System.out.println(user);
		if(!user.equals(null)) {
			Task newTask = new Task();
			newTask.setUser(user);
			newTask.setCompleted(task.isCompleted());
			newTask.setDescription(task.getDescription());
			newTask.setEndDate(task.getEndDate());
			newTask.setTitle(task.getTitle());
			newTask.setLabel(task.getLabel());
			newTask.setStartDate(task.getStartDate());
			taskRepository.save(newTask);
		}
		return taskRepository.findAll();
	}
}
