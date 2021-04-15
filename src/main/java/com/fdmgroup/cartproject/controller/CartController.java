package com.fdmgroup.cartproject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fdmgroup.cartproject.model.Item;
import com.fdmgroup.cartproject.repo.CartDao;
import com.fdmgroup.cartproject.repo.ItemDao;

@Controller
public class CartController {
	
	@Autowired
	ItemDao itemDao;
	
	@Autowired
	CartDao cartDao;

//	@GetMapping("Cart")
//	public ModelAndView cart(Model model, int id, double price) {
//		model.addAttribute(id);
//		model.addAttribute(price);
//		return new ModelAndView("cart.jsp", "items", cartDao.findById(id));
//	}	
	
	@GetMapping("addItemToCart")
	public ModelAndView addtoOrder(@RequestParam("id") int id) {
		
		return new ModelAndView ("neworder.jsp", "item", itemDao.findById(id));

	}
	
	@GetMapping("AddToCart")
	public ModelAndView addToCart(@RequestParam("id") int id) {
		
		return new ModelAndView ("neworder.jsp", "item", itemDao.findById(id));
	}
	
	@GetMapping("viewItem")
	public ModelAndView addQuantity(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView();
		Optional<Item> itemFromDatabase = itemDao.findById(id);
		mv.addObject("id", id);
		return new ModelAndView ("enterQuantity.jsp", "item", itemDao.findById(id));
	}
	
}
