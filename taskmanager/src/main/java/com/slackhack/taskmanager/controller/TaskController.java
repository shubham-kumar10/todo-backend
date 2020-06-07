/**
 * @author: Shubham
 *
 */
package com.slackhack.taskmanager.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.slackhack.taskmanager.model.Task;
import com.slackhack.taskmanager.service.TaskService;

@RestController
@CrossOrigin("http://localhost:4200")
public class TaskController {

	@Autowired
	TaskService taskService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TaskController.class);
	
	@GetMapping
	public String test() {
		return "Hello, World!";
	}
	
	@GetMapping("/tasks")
	public List<Task> getTasks(){
		LOGGER.info("Entered getTask()");
		return taskService.getTasks();
	}
	
	@PostMapping("/addtask")
	public List<Task> addTask(@RequestBody @Valid Task task){
		return taskService.addTask(task);
	}
}
