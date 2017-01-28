package com.neu.webtools;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neu.webtools.pojo.Person;
@Controller
public class RedirectionController {
	@RequestMapping(value="/login.htm", method=RequestMethod.GET)
	public String login(@ModelAttribute("person")Person person){
		
		return "login";
	}
	@RequestMapping(value="registrationsuccess.htm", method=RequestMethod.GET)
	public String re(@ModelAttribute("person")Person person){
		
		return "login";
	}
	

}
