package com.template.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.template.entity.Student;

@Repository
public interface TemplateDao extends CrudRepository<Student , String> {

	
}
