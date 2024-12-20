package com.training.api.taskmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.api.taskmanagement.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}
