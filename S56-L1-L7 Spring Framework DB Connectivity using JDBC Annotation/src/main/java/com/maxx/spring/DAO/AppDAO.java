package com.maxx.spring.DAO;

import java.util.List;

import com.maxx.spring.model.Users;


public interface AppDAO {

	public List<Users> listUserss();
	public void addUsers(Users userss);
}
