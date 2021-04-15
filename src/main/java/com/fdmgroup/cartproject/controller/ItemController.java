package com.fdmgroup.cartproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fdmgroup.cartproject.repo.CartDao;
import com.fdmgroup.cartproject.repo.ItemDao;

@Controller
public class ItemController {
	private int id;
	
	@Autowired
	private ItemDao itemDao;
	
	@Autowired
	private CartDao cartDao;
	
	@GetMapping("AllItems")
	public ModelAndView index() {
	return new ModelAndView ("allItems.jsp", "items", itemDao.findAll());
	}
	

//	@GetMapping("viewItem")
//    public ModelAndView addItem(@RequestParam("id") int id, Model model){
//        this.id = id;
//        model.addAttribute("item", itemDao.findById(id));
//        return new ModelAndView("cart.jsp");
//}

}