package com.seehope.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.seehope.pojo.User;
import com.seehope.pojo.User_list;
import com.seehope.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserAction {

	@Resource(name="userService")
	private IUserService service;
	
	@RequestMapping("/test")
	@ResponseBody
	public List<User> test(HttpServletResponse resp) {
		System.out.println("我进来了");
		return service.listAll();
	}
	@RequestMapping("/test1")
	@ResponseBody
	public List<User_list> test1(HttpServletResponse resp) {
		System.out.println("我进来了");
		return service.listAll1();
	}
}
