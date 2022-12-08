package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.promotion.Brands;
//import com.example.demo.promotion.Project;

@Repository
public interface BrandsRepository extends MongoRepository<Brands,String> {

}
