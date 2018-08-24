package com.gxnu.study.service;

import java.util.List;

import com.gxnu.study.bean.User;

public interface UserService {
	List<User> selectAllUsers();
	void addUser(User user);
	void deleteUser(int id);
}
