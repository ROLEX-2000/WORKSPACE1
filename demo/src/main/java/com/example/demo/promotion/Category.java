package com.example.demo.promotion;

public class Category {
	 private  String categoryName;
	 
	 private String categoryKey;

	public Category(String categoryName, String categoryKey) {
		super();
		this.categoryName = categoryName;
		this.categoryKey = categoryKey;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryKey() {
		return categoryKey;
	}

	public void setCategoryKey(String categoryKey) {
		this.categoryKey = categoryKey;
	}
	 
	 
	

}
