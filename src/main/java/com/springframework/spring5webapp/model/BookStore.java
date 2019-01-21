package com.springframework.spring5webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BookStore {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String isAvailable;
	private int quantity;

	public BookStore() {
	}

	public BookStore(String name, String isAvailable, int quantity) {
		super();
		this.name = name;
		this.isAvailable = isAvailable;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "BookStore [id=" + id + ", name=" + name + ", isAvailable=" + isAvailable + ", quantity=" + quantity
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
