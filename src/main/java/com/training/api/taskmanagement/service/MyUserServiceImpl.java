package com.training.api.taskmanagement.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.api.taskmanagement.entity.MyUser;
import com.training.api.taskmanagement.repository.MyUserRepository;

@Service
public class MyUserServiceImpl implements MyUserService {


    @Autowired
    private MyUserRepository myUserRepository;

    @Override
    public MyUser getUserById(int id) {
        return myUserRepository.findById(id).orElse(null);
    }

    @Override
    public MyUser createUser(MyUser user) {
        return myUserRepository.save(user);
    }

    @Override
    public MyUser updateUser(int id, MyUser user) {
        MyUser existingUser = myUserRepository.findById(id).orElse(null);
        if (existingUser != null) {
            user.setId(id);
            return myUserRepository.save(user);
        }
        return null;
    }


    @Override
    public void deleteUser(int id) {
        myUserRepository.deleteById(id);
    }

	@Override
	public MyUser getUserByUsername(String username) {
		 return myUserRepository.findByUsername(username).orElse(null);
	}

}
