package com.neu.webtools;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.neu.webtools.dao.JobDao;
import com.neu.webtools.dao.PersonDao;
import com.neu.webtools.pojo.JobsApplied;
import com.neu.webtools.pojo.Person;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "postStatus/{jobsAppliedId}", method = RequestMethod.POST)
    public String view(@RequestParam("message")String message,@RequestParam("status")String status,@PathVariable("jobsAppliedId")long jobsAppliedId,Model model,HttpServletRequest request, HttpServletResponse response,HttpSession session) {
    	System.out.println(jobsAppliedId);
    		JobDao js=new JobDao();
    		
    		js.change(status,message,jobsAppliedId);
    		
    	
    	
           return "employerhome";


	}
	@RequestMapping(value="/logout.htm")
	public String showLogout(HttpSession session){
		
		session.invalidate();
		
		return "index";
		
	}
}
