package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.app.pojos.User;
@Service
public interface UserServiceI {
	
List<User> getAllUserDetails();
User saveUserDetails(User user);
String deleteUserDetailsa(int id);

	

}
