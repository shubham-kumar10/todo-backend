package com.slackhack.taskmanager.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "subtask")
public class Subtask {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subtask_id")
	private int id;

	@Column(name = "subtask_title")
	private String title;

	@Column(name = "subtask_description")
	private String description;

	@Column(name = "subtask_estimate")
	private Date estimate;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="task_id")
	@NotNull
	private Task task;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEstimate() {
		return estimate;
	}

	public void setEstimate(Date estimate) {
		this.estimate = estimate;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((estimate == null) ? 0 : estimate.hashCode());
		result = prime * result + id;
		result = prime * result + ((task == null) ? 0 : task.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subtask other = (Subtask) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (estimate == null) {
			if (other.estimate != null)
				return false;
		} else if (!estimate.equals(other.estimate))
			return false;
		if (id != other.id)
			return false;
		if (task == null) {
			if (other.task != null)
				return false;
		} else if (!task.equals(other.task))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Subtask [id=" + id + ", title=" + title + ", description=" + description + ", estimate=" + estimate
				+ ", task=" + task + "]";
	}
		
}
