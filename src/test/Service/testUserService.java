package test.Service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gxnu.study.bean.User;
import com.gxnu.study.service.UserService;

public class testUserService {
	private UserService userService;
	@Before
	public void init(){
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("resource/spring-mybatis.xml");		
		userService = ac.getBean(UserService.class);
	}
	@Test
	public void testSelectAllUsers(){
		userService.selectAllUsers().forEach(System.out::println);
	}
	@Test
	public void testAddUser(){
		userService.addUser(new User("mybatis", 10));
	}
	@Test
	public void testDeleteUser(){
		userService.deleteUser(13);
	}
}
