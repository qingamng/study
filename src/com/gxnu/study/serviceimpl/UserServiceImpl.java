package com.gxnu.study.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gxnu.study.bean.User;
import com.gxnu.study.dao.UserDao;
import com.gxnu.study.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	@Override
	public List<User> selectAllUsers() {
		return userDao.selectUser();
	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);

	}

	@Override
	public void deleteUser(int id) {
		userDao.deleteUserById(id);
	}
	

}
