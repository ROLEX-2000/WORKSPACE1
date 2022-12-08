package com.example.demo.promotion;

import java.util.List;

public class Project {

	public Promotion promotion;
	
	public Brands brands;
	
	public List<Categories> cat;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	public Brands getBrands() {
		return brands;
	}

	public void setBrands(Brands brands) {
		this.brands = brands;
	}

	public List<Categories> getCat() {
		return cat;
	}

	public void setCat(List<Categories> cat) {
		this.cat = cat;
	}
	
	
	
	
}
