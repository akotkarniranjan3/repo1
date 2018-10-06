package com.template.run;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



@Service
public class Services {

	@Autowired
	CookRepository cr;
	
	public Cook save(Cook cook)
	{
		return cr.save(cook);
	}
	
	public Cook getCook(int cook_id)

	
	{  		
		return cr.findById(cook_id).orElse(null);

	}
	
	public Cook updateDetail(Cook cook) {
		
		Cook temp = cr.findById(cook.getId()).orElseGet(null);  	
		temp.setMobile(cook.getMobile());
	    temp.setName(cook.getName());
	    temp.setRecipes(cook.getRecipes());
	    temp.setSalary(cook.getSalary());
		cr.save(temp);
		return temp;
	}

	public Iterable<Cook> getAll(String num) {
		return cr.findBySearchTerm(num).
				stream().
				filter(p -> p.getRecipes().size() > 2).sorted((x,y) ->  y.getRecipes().size() - x.getRecipes().size() )
				.collect(Collectors.toList());
	}
	public Iterable<Cook> getAll() {
		
		
		
		return cr.findAll();
	}
	
	  public List<Cook> findByName(String name){
		  return cr.findByName(name);
	  }


	
}
