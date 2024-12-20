package com.training.api.taskmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.api.taskmanagement.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{

}
