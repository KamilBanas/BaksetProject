package com.fdmgroup.cartproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fdmgroup.cartproject.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

	User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

	User findByUsername(@Param("username") String username);
}
