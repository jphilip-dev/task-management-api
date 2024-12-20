package com.training.api.taskmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.api.taskmanagement.entity.MyUser;

public interface MyUserRepository extends JpaRepository<MyUser, Integer>{

}
