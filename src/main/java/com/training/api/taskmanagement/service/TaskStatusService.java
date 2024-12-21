package com.training.api.taskmanagement.service;

import com.training.api.taskmanagement.entity.TaskStatus;

public interface TaskStatusService {
	// Basic CRUD
	
    TaskStatus getTaskStatusById(int id);
    TaskStatus createTaskStatus(TaskStatus taskStatus);
    TaskStatus updateTaskStatus(int id, TaskStatus taskStatus);
    void deleteTaskStatus(int id);

}
