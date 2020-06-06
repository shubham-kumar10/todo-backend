package com.slackhack.taskmanager.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.slackhack.taskmanager.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
	
	List<Task> findAllByTask(Task mentor);
	
}