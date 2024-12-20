package com.training.api.taskmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.api.taskmanagement.entity.TaskStatus;

public interface TaskStatusRepository extends JpaRepository<TaskStatus, Integer>{

}
