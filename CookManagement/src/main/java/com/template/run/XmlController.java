package com.template.run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class XmlController {
    
	@Autowired
	Services sr;
	
	@RequestMapping(value = "/homes", method = RequestMethod.GET,  produces = "application/xml" ,consumes = MediaType.ALL_VALUE)
	public  @ResponseBody Cook getOne()
	{
		return sr.getAll().iterator().next();
	}
	
}
