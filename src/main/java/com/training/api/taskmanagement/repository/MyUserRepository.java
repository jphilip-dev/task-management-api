package com.training.api.taskmanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.api.taskmanagement.entity.MyUser;

public interface MyUserRepository extends JpaRepository<MyUser, Integer>{
	
	Optional<MyUser> findByUsername(String username);
	
}
