package com.fdmgroup.cartproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cart_gen")
	@SequenceGenerator(name = "cart_gen", sequenceName = "CART_SEQ", allocationSize = 1)
	private int id;
	private String name;
	private String description;
	private double price;
	private int amount;
	
	public Cart() {
		super();
	}

	public Cart(String name, String description, double price, int amount) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", amount="
				+ amount + "]";
	}
	
	
}

	

	

