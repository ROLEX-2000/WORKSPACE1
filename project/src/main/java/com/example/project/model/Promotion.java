package com.example.project.model;

import java.util.Date;
import java.util.List;

//import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Promotion")
public class Promotion {
	@org.springframework.data.annotation.Id
	@NotNull	
	private String id;
	@NotBlank
	private String description;
	
	private String PromotionBrand;
	
	private Date endDateTime;
	
	private String PromotionLine;
	
	private  String offerDetail;
	
	private Date  startDateTime;
	 
	private String[] channel;
	
	

	private String type;
	
	
	private Brand brand;
	
	private List<Categories> categories;

	public Promotion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPromotionBrand() {
		return PromotionBrand;
	}

	public void setPromotionBrand(String promotionBrand) {
		PromotionBrand = promotionBrand;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public String getPromotionLine() {
		return PromotionLine;
	}

	public void setPromotionLine(String promotionLine) {
		PromotionLine = promotionLine;
	}

	public String getOfferDetail() {
		return offerDetail;
	}

	public void setOfferDetail(String offerDetail) {
		this.offerDetail = offerDetail;
	}

	public Date getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public String[] getChannel() {
		return channel;
	}

	public void setChannel(String[] channel) {
		this.channel = channel;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public List<Categories> getCategories() {
		return categories;
	}

	public void setCategories(List<Categories> categories) {
		this.categories = categories;
	}

	
	
	

}
