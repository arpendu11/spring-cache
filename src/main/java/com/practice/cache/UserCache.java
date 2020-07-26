package com.practice.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.practice.model.Users;
import com.practice.repository.UserRepository;

@Component
public class UserCache {
	
	@Autowired
	UserRepository userRepo;

	@Cacheable(value = "userCache", key = "#name")
	public Users getUser(String name) {
		System.out.println("Retrieveing from database: " + name);
		return userRepo.findByName(name);
	}
}
