package com.training.api.taskmanagement.service;

import com.training.api.taskmanagement.entity.Task;

public interface TaskService {
	
	// Basic CRUD
	
    Task getTaskById(int id);
    Task createTask(Task task);
    Task updateTask(int id, Task task);
    void deleteTask(int id);
}
