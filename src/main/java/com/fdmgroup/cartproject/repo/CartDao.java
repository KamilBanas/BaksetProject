package com.fdmgroup.cartproject.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fdmgroup.cartproject.model.Cart;

@Repository
public interface CartDao extends JpaRepository<Cart, Integer> {
	
}
