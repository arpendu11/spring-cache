package com.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.model.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

	Users findByName(String name);

}
