package com.fdmgroup.cartproject;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;

import com.fdmgroup.cartproject.model.Cart;
import com.fdmgroup.cartproject.model.Item;
import com.fdmgroup.cartproject.repo.CartDao;
import com.fdmgroup.cartproject.repo.ItemDao;

@SpringBootTest
@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
class ItemIntegrationTest {

	@Autowired
	ItemDao itemDao;
	Item item;
	
	@Autowired
	CartDao cartDao;
	

	@BeforeEach
	void setUp() throws Exception {
		item = new Item("Helmet", "nice", 8.99);
	}

	@Test
	void testAddItemToCartTest() {
		Cart cartItems = new Cart();
		cartItems.add(item);
	
	}

}
