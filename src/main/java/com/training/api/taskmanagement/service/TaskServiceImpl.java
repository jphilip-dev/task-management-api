package com.training.api.taskmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.api.taskmanagement.entity.Task;
import com.training.api.taskmanagement.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task getTaskById(int id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(int id, Task task) {
        Task existingTask = taskRepository.findById(id).orElse(null);
        if (existingTask != null) {
            task.setId(id);
            return taskRepository.save(task);
        }
        return null;
    }

    @Override
    public void deleteTask(int id) {
        taskRepository.deleteById(id);
    }
}
