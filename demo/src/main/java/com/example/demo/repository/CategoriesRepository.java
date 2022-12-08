package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.promotion.Categories;
//import com.example.demo.promotion.Project;



@Repository
public interface CategoriesRepository extends MongoRepository<Categories,String> {

}