package com.practice.seed;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.model.Users;
import com.practice.repository.UserRepository;

@Component
public class DataLoader {
	
	@Autowired
	UserRepository userRepo;
	
	@PostConstruct
	public void load() {
		List<Users> userList = getList();
		userRepo.saveAll(userList);
	}

	private List<Users> getList() {
		List<Users> usersList = new ArrayList<>();
		usersList.add(new Users("Atul", "Atlas", 123L));
		usersList.add(new Users("Azeez", "Atlas", 123L));
		usersList.add(new Users("Arpendu", "Pioneers", 23L));
		usersList.add(new Users("Vineet", "Pioneers", 123L));
		usersList.add(new Users("Tapas", "Jaguar", 100L));
		return usersList;
	}

}
