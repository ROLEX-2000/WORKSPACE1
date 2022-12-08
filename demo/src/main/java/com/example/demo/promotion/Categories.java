package com.example.demo.promotion;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="category")
public class Categories {
	
	private List<Category>categories;

	public Categories(List<Category> categories) {
		super();
		this.categories = categories;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
	
	

}
