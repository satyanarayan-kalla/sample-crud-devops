package com.bezkoder.spring.datajpa.repository;

import java.util.List;

import com.bezkoder.spring.datajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findAll();
	List<User> findByUserId(long id);
}
