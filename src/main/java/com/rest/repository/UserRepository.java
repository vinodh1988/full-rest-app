package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entities.User;




public interface UserRepository extends JpaRepository<User, String> {
  public User findUserByUsername(String username);
}
