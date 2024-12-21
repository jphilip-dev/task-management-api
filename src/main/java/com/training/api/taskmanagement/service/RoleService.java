package com.training.api.taskmanagement.service;

import com.training.api.taskmanagement.entity.Role;

public interface RoleService {
	// Basic CRUD
	
    Role getRoleById(int id);
    Role createRole(Role role);
    Role updateRole(int id, Role role);
    void deleteRole(int id);
}
