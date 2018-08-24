package com.gxnu.study.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.gxnu.study.bean.User;

public interface UserDao {
	//使用注解，需要在配置文件mybatis-config.xml配置类路径
	@Select("select * from user")
	List<User> selectUser();
	@Insert("insert into user(name,age) values(#{name},#{age})")
	void addUser(User user);
	
	void deleteUserById(int id);
}
