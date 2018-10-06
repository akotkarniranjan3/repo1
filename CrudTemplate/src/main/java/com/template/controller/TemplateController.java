package com.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.template.dao.TemplateDao;
import com.template.entity.Student;
import com.template.services.TemplateServices;

@RestController
@RequestMapping("/apis")

public class TemplateController {
    
	@Autowired
	TemplateServices service ;
	
	@Autowired
	TemplateDao dao;
	
	
	@GetMapping("/find/{user}")
    public Student getStudent(@PathVariable("user") String user)
    {
		return service.find(user);
		
    }
	@GetMapping("/oll")
	public Iterable<Student> getStew()
	{
		return dao.findAll();
	}
	
	@PostMapping
	public Student putStudent(@RequestBody Student student) 
	{
		return service.create(student);
		
	}
	
}
