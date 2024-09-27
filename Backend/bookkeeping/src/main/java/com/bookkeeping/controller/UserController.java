package com.bookkeeping.controller;

import com.bookkeeping.model.User;
import com.bookkeeping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User createdUser = userService.createUser(user);
		return ResponseEntity.ok(createdUser);
	}
}
