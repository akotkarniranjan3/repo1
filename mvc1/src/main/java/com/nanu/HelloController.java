package com.nanu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
	String getHello() {
		return "hello";
	}
	
	@RequestMapping(value = "/hello1", method = RequestMethod.POST)
 Stu getHello(@RequestBody Stu stu) {
		return stu;
	}
	
	
	
	
	
//	 @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
//     public ModelAndView addStudent( HttpServletRequest request,HttpServletResponse  response, ModelMap model
//  
//  ) {
//		 System.out.println();
//	
//		 Stu s = new Stu(request.getParameter("firstname") , request.getParameter("mydropdown"));
//		
//		 System.out.println(model);
//		 
//     model.addAttribute("st",s);
//    
//     ModelAndView mav=new ModelAndView();
//     mav.addAllObjects(model);
//     mav.setViewName("resulty");
//     return mav;
//  }
	 @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
     public String addStudent( Model model , @ModelAttribute("st") Stu stu  , ModelMap m1)
  
   {
		 System.out.println();
	
		// Stu s = new Stu(request.getParameter("firstname") , request.getParameter("mydropdown"));
		
		// System.out.println(model + " \n"  + m1);
		// String a = "hello";
		 
     //model.addAttribute("st",stu);
    
        //ModelAndView mav=new ModelAndView();
       //mav.addObject(model);
      //mav.addObject("bro", a);
     //mav.setViewName("resulty");
    //return mav;
  
   return "resulty";
   }
	 @ModelAttribute
	 public void addAttribute(Model map , Model map1) {
		 map.addAttribute("name", "nanen");
		 map1.addAttribute("manu","dada bhai keshariya");
	 }
}
