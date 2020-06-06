package com.slackhack.taskmanager.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.slackhack.taskmanager.model.Subtask;

public interface SubtaskRepository extends JpaRepository<Subtask, Long> {
	
	List<Subtask> findAllBySubtask(Subtask subtask);
	
}