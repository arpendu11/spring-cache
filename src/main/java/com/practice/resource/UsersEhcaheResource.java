package com.practice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.cache.UserCache;
import com.practice.model.Users;

@RestController
@RequestMapping(value = "/rest/search/ehcache")
public class UsersEhcaheResource {
	
	@Autowired
	UserCache userCache;
	
	@GetMapping(value = "/{name}")
	public Users getUser(@PathVariable final String name) {
		return userCache.getUser(name);
	}
}
