package com.template.run;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CookController {

	@Autowired
	Services sr;
	
	@PostMapping(path = "/home")
	public Cook put(@RequestBody Cook cook)
	{
		return sr.save(cook);
	}
	
	
	@GetMapping(path = "/home/{cook_id}")
	public Cook getCook(@PathVariable("cook_id") int cook_id)
	{
		return sr.getCook(cook_id);

	}
	@GetMapping("/homy/{cook_name}")
	public Iterable<Cook> getAll(@PathVariable("cook_name") String cooky)
	{
		return sr.findByName(cooky);
	}

	@PostMapping("/home/update")
	public Cook update(@RequestBody Cook cook)
	{
		return sr.updateDetail(cook);

	}
	@GetMapping("/homy")
	public Iterable<Cook> getAll()
	{
		return sr.getAll();
	}

}
