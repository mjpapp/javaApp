package com.seehope.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.seehope.dao.IUserDao;
import com.seehope.dao.IUser_listDao;
import com.seehope.pojo.User;
import com.seehope.pojo.User_list;
import com.seehope.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Resource
	private IUserDao dao;
	
	@Resource
	private IUser_listDao dao1;
	
	public List<User> listAll() {
		System.out.println("我进来了");
		return dao.listUser();
	}
	public List<User_list> listAll1() {
		System.out.println("我进来了");
		return dao1.listUser_list();
	}


}
