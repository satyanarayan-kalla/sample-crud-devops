package com.bezkoder.spring.datajpa.controller;

import java.util.ArrayList;
import java.util.List;

import com.bezkoder.spring.datajpa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.datajpa.repository.UserRepository;

@RestController
public class UsersController {

	@Autowired
	UserRepository userRepository;
	String status = "SYSTEM-DOWN";

	@GetMapping("/live")
	public ResponseEntity<String> getUsers() {
		try {
			List<User> users = new ArrayList<User>();

			userRepository.findAll().forEach(users::add);

			if (!users.isEmpty()) {
				status = "OK";
				return new ResponseEntity<>(status, HttpStatus.OK);
			}

		} catch (Exception e) {
			return new ResponseEntity<>(status, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(status, HttpStatus.INTERNAL_SERVER_ERROR);
	}


}
