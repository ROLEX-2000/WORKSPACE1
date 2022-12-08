package com.example.demo.promotion;



import org.springframework.data.mongodb.core.mapping.Document;




import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;



@Document(collection="promotion")
public class Promotion {
@Id
	private  String id;
	
	private String description;
	
	private String promotionBrand;
	
	private String displayName;
	
	private Date endDateTime;
	
	private String promotionLine;
	
	private String offerDetail;
	
	private Date startDateTime;
	
	private String type;
	


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
		return promotionBrand;
	}

	public void setPromotionBrand(String promotionBrand) {
		this.promotionBrand = promotionBrand;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public String getPromotionLine() {
		return promotionLine;
	}

	public void setPromotionLine(String promotionLine) {
		this.promotionLine = promotionLine;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Promotion [id=" + id + ", description=" + description + ", promotionBrand=" + promotionBrand
				+ ", displayName=" + displayName + ", endDateTime=" + endDateTime + ", promotionLine=" + promotionLine
				+ ", offerDetail=" + offerDetail + ", startDateTime=" + startDateTime + ", type=" + type + "]";
	}

	
	


	
}

