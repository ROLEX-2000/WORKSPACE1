package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.promotion.Project;
import com.example.demo.repository.ProjectRepository;


@Service
public class ProjectService {
	
	
	@Autowired
	private ProjectRepository  repo;

	    
	    public Project create(Project project) {
			
			return repo.save(project);

}
}
