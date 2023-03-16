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

	@GetMapping("/live/{id}")
	public ResponseEntity<List<User>> getAllTutorials(@PathVariable("id") long id) {
		try {
			List<User> users = new ArrayList<User>();

			if (id == 0)
				userRepository.findAll().forEach(users::add);
			else
				userRepository.findByUserId(id).forEach(users::add);

			if (users.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(users, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


}
