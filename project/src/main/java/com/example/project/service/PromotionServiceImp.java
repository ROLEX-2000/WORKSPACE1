package com.example.project.service;

import org.springframework.stereotype.Service;

import com.example.project.model.Promotion;
import com.example.project.repository.PromotionRepository;

@Service
public class PromotionServiceImp implements  PromotionService {

	private PromotionRepository repo;
	
	
	@Override
	public Promotion save(Promotion promotion) {
		return repo.save(promotion);
	}
	
	
	
	
	
	
	
	
	
}




