package com.example.demo.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.promotion.Project;
//import com.example.demo.promotion.Promotion;
//import com.example.demo.repository.ProjectRepository;
import com.example.demo.service.ProjectService;
//import com.example.mongodb.service.PromotionService;



@RestController
@RequestMapping(value="/api")
public class ProjectController {
	
	@Autowired
	private ProjectService service;
	
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Project find(@RequestBody Project project){
		return service.create(project);
		
		
	}
	
	
	

}
