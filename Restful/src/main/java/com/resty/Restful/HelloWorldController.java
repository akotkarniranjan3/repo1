package com.resty.Restful;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	UserDao userdao;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloWorld() throws Exception
	{
		
		return "abc";
	}
	
	@GetMapping(path = "/hello-bean/{name}" )
	public HelloWorldBean helloWorldBean(@PathVariable String name)
	{
		return new HelloWorldBean("Hello World" + name);
	}
	
	@PostMapping(path = "/hello-7")
	public String porky(@Valid @RequestBody User user)
	{
		userdao.save(user);
		
		
		return user.toString();
	}
	
	@GetMapping(path = "/showy")
	public ArrayList<User> showAll()
	{
		return userdao.showall();
		
		
	}
	
	
	
}
