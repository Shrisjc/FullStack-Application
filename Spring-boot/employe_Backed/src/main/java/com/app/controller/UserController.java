package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.User;
import com.app.repo.UserRepoI;
import com.app.service.UserServiceI;
@CrossOrigin(origins = "http://localhost:3000" )
@RestController
//@RequestMapping("/api/v1/")
public class UserController {
	
	
	@Autowired
	private UserServiceI userService;
	
	@PostMapping("/users")
	User newUser(@RequestBody User user) {
		return userService.saveUserDetails(user);
	}

//	 @DeleteMapping("/Users/{id}")
//	    public ResponseEntity<?> deleteUser(@PathVariable("id") int id) {
//	        empService.deleteEmpDetails(id);
//	        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//	    }
	 
	 @DeleteMapping("/Users/{id}")
	 public String deleteUser(@PathVariable("id") int id) {
		 return userService.deleteUserDetailsa(id);
	 }

	
	 @GetMapping("/Users")
	public List<User> getALlUser(){
		return userService.getAllUserDetails();
	}
	
   

}
