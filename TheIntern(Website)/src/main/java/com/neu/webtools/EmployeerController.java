 package com.neu.webtools;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neu.webtools.dao.PersonDao;
import com.neu.webtools.pojo.Employer;
import com.neu.webtools.pojo.JobSeeker;
import com.neu.webtools.pojo.Person;
@Controller
public class EmployeerController {
	
	@RequestMapping(value = "/employeesignup.htm", method = RequestMethod.GET)
    public String register(@ModelAttribute("employer") Employer employer) {
    	//HttpSession session = request.getSession();
	   // session.setAttribute("users", new UserAccount());
    	
		//model.addAttribute("combined",new Combined());
        
        return "employeesignup";
    }
	
	
	
	
	
	

}
