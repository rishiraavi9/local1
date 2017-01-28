package com.neu.webtools;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neu.webtools.dao.PersonDao;
import com.neu.webtools.pojo.Employer;
import com.neu.webtools.pojo.Job;
import com.neu.webtools.pojo.JobSeeker;

@Controller
public class UpdateController {
	@Autowired
    @Qualifier("jobseekerValidator")
    UpdateValidator validator;

    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator(validator);
    }
	
	
	

	@RequestMapping(value = "/update.htm", method = RequestMethod.POST)
    public String postjob(@ModelAttribute("update")JobSeeker js,BindingResult result,HttpServletRequest request, HttpServletResponse response,HttpSession session) {
		validator.validate(js, result);
		   if (result.hasErrors()) {
	            return "viewAndUpdateProfile";
	        }
		PersonDao p=new PersonDao();
    	 
    	
    	//System.out.println(job.getExperience());
		//System.out.println(job.getIndustry());
		JobSeeker j=(JobSeeker) session.getAttribute("jobseekerAccount");
		
		long personID=j.getPersonID();
    	
		p.updateProfile(personID,js.getEmail(),js.getAddress(),js.getFirstName(),js.getLastName());
       
        return "jobseekerhome";
    }
	
	
	
	
	
	
	
	
}
