package com.gxnu.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gxnu.study.bean.User;
import com.gxnu.study.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public ModelAndView addUser(User user){
		System.out.println(user.toString());
		userService.addUser(user);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("allUsers");
		mav.addObject("allUsers", userService.selectAllUsers());
		return mav;
	}
}
