package com.example.demo.repository;

//import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.promotion.Project;
//import com.example.demo.promotion.Promotion;
//import com.example.demo.promotion.Responsemeta;

@Repository
public interface ProjectRepository extends MongoRepository<Project,String> {

}
