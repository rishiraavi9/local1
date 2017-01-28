package com.neu.webtools;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neu.webtools.dao.JobDao;
import com.neu.webtools.pojo.Employer;
import com.neu.webtools.pojo.Job;

@Controller
public class PostJobController {
	@Autowired
    @Qualifier("jobValidator")
    JobValidator validator;


    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator(validator);
    }
	
	
	
	@RequestMapping(value = "/jobpost", method = RequestMethod.POST)
    public String register(@ModelAttribute("job")Job job,BindingResult result,Model model,HttpServletRequest request, HttpServletResponse response,HttpSession session) {
		 validator.validate(job, result);
		   if (result.hasErrors()) {
	            return "employeejob";
	        }
		
		try{
    		//PersonDao personDao=new PersonDao();
    		JobDao j=new JobDao();
    		 
    		System.out.println(job.getExperience());
    		System.out.println(job.getIndustry());
    		Employer e=(Employer) session.getAttribute("empAccount");
        	String userName=e.getUserName();
        	System.out.println(job.getJobTitle());
    		j.postJob(job.getIndustry(),job.getJobTitle(),job.getExperience(), job.getJobFunction(),job.getJobDescription(),userName,job.getCompanyName(),job.getLocation());
		//String industry=request.getParameter("industry");
    	//String experience=request.getParameter("experience");
    	//String jobFunction=request.getParameter("jobFunction");
    	//String jobDescription=request.getParameter("jobDescription");
    	//String title=request.getParameter("title");
    	
    		
    	
    	}catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
           return "employeepostjobsuccess";


	}
	

	

}
