package com.fdmgroup.cartproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fdmgroup.cartproject.model.Item;

@Repository
public interface ItemDao extends JpaRepository<Item, Integer> {

}
