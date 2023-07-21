package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.User;
import com.app.repo.UserRepoI;

@Service
public class UserService implements UserServiceI {

	@Autowired
	private UserRepoI userRepo;

	@Override
	public List<User> getAllUserDetails() {
		return userRepo.findAll();
	}

	@Override
	public User saveUserDetails(User User) {
		// TODO: Implement the logic to save the User details
		User savedUser = userRepo.save(User);
		return savedUser;
	}

	@Override
	public String deleteUserDetailsa(int id) {
		String msg = "User not delete successfully";
		if (userRepo.existsById(id)) {
			userRepo.deleteById(id);
			msg = "sucessfully delete User :" + id;
		}
		return msg;
	}

}
