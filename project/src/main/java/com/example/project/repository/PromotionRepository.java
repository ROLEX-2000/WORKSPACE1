package com.example.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Promotion;

@Repository
public interface PromotionRepository extends MongoRepository<Promotion, Integer> {

}
