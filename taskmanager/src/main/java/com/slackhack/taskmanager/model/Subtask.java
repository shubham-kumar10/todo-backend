package com.slackhack.taskmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// 1st step @Entity

@Entity
@Table(name="subtask")
public class Subtask {

	@Column(name="id")
	private int id;

}
