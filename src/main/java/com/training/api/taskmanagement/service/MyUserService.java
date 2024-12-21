package com.training.api.taskmanagement.service;

import com.training.api.taskmanagement.entity.MyUser;

public interface MyUserService {
	
	// Basic CRUD
	
	MyUser getUserById(int id);
	
    MyUser createUser(MyUser user);
    
    MyUser updateUser(int id, MyUser user);
    
    void deleteUser(int id);
    
    // Custom methods
    
    MyUser getUserByUsername(String username);
}
