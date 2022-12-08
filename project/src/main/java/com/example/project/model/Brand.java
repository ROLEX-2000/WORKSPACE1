package com.example.project.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Brand")

public class Brand {
	
	private String _id;
	
	private String displayName;

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
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
