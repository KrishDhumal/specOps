package com.zs.service;

import java.util.List;

import com.zs.entity.User;

public interface UserService {
	
	int addUser(User user);
	
	User getUser(int userid);
	
	List<User> getAllUsers();
	
}
