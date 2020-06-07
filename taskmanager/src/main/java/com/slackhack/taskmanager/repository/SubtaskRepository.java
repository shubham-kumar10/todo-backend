package com.slackhack.taskmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slackhack.taskmanager.model.Subtask;
import com.slackhack.taskmanager.model.Task;

public interface SubtaskRepository extends JpaRepository<Subtask, Long> {
	
	List<Subtask> findAllByTask(Task task);
	
}