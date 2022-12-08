package com.example.demo.promotion;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Brands")

public class Brands {

	private String _id;

	private String displayName;

	public Brands(String _id, String displayName) {
		super();
		this._id = _id;
		this.displayName = displayName;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	


}
