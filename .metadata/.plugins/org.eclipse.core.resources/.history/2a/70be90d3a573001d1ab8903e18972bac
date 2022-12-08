package com.example.project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Promotion;
import com.example.project.service.PromotionServiceImp;

@RestController
@RequestMapping("/promotion")
public class PromotionController {

	private PromotionServiceImp promo;
	
	
	@PostMapping("/create")
	 public Promotion save(@RequestBody Promotion promotion) {
		 return  promo.save(promotion);
		
	}
}
