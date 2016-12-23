package com.seehope.service;

import java.util.List;

import com.seehope.pojo.User;
import com.seehope.pojo.User_list;

public interface IUserService {
	
	List<User> listAll();

	List<User_list> listAll1();
}
