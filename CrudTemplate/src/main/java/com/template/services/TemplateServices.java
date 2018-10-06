package com.template.services;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.template.dao.TemplateDao;
import com.template.entity.Student;

@Service
public class TemplateServices {
    
	@Autowired
	TemplateDao dao;
	
	public Student create(Student s )
	{
	return 	dao.save(s);
	}
	
	public Student find(String user_name)
	{
		
		Optional<Student> res = dao.findById(user_name);
		
		if(res.isPresent())
		return res.get();
		
		
		return null;
	}
	
	
	
}
