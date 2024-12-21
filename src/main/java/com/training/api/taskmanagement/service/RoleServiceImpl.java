package com.training.api.taskmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.api.taskmanagement.entity.Role;
import com.training.api.taskmanagement.repository.RoleRepository;


@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
    private RoleRepository roleRepository;

	@Override
	public Role getRoleById(int id) {
		return roleRepository.findById(id).orElse(null);
	}

	@Override
	public Role createRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public Role updateRole(int id, Role role) {
		Role existingRole = roleRepository.findById(id).orElse(null);
		if (existingRole != null) {
			role.setId(id);
			return roleRepository.save(role);
		}
		return null;
	}

	@Override
	public void deleteRole(int id) {
		roleRepository.deleteById(id);
	}

}
