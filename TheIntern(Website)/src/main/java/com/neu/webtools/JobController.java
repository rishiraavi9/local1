package com.neu.webtools;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.neu.webtools.dao.JobDao;
import com.neu.webtools.dao.PersonDao;
import com.neu.webtools.pojo.Employer;
import com.neu.webtools.pojo.Job;
import com.neu.webtools.pojo.JobSeeker;
import com.neu.webtools.pojo.JobsApplied;

@Controller
public class JobController {
	@RequestMapping(value = "applyjob/{id}", method = RequestMethod.GET)
	public String applyJob(@PathVariable("id")long jobId,ModelAndView model,HttpServletRequest req,HttpSession session){
		try{
			JobDao job=new JobDao();
			JobSeeker j=(JobSeeker) req.getSession().getAttribute("jobseekerAccount");
			System.out.println("hi");
			System.out.println(j.getPersonID());
			
			Boolean isValid=job.resumeCheck(j.getPersonID());
        	if(!isValid){
        		System.out.println("in");
        		return "resumeNotFound";
        	           	
        	}
			
			
			//JobSeeker js=(JobSeeker) req.getSession().getAttribute("jobseekerAccount");
			long userId=j.getPersonID();
			System.out.println(j.getPersonID());
			
			job.apply(userId,jobId);
			
		}
		catch(Exception e){
			
		}
		return "applySucces";
}
	@RequestMapping(value = "/changeStatus/{jobsAppliedId}", method = RequestMethod.GET)
	public String view(@PathVariable("jobsAppliedId")long jobsAppliedId,HttpServletRequest req,Model model){
		try{
			JobDao job=new JobDao();
		JobsApplied ja=(JobsApplied)job.retrieveJobsApplied(jobsAppliedId);
		model.addAttribute("status",ja);
		}
		catch(Exception e){
			
		}
		return "viewApplicantForm";
}
	
	@RequestMapping(value = "redirectEmp.htm", method = RequestMethod.GET)
	public String successemp(Model model,HttpServletRequest req,HttpSession session){
		try{
			JobDao jd=new JobDao();
			Employer e=(Employer) session.getAttribute("empAccount");
			
			long id=e.getPersonID();
			List<Job> jobList=jd.getListOfPostedJobs(id);
			model.addAttribute("jobList",jobList);
			
		}
		catch(Exception e){
			
		}
		return "employerhome1";
		
		
		
		
		
		
		
		
		
	}
	@RequestMapping(value = "redirect.htm", method = RequestMethod.GET)
	public String succesemp(Model model,HttpServletRequest req,HttpSession session){
		try{
			JobDao jd=new JobDao();
			Employer e=(Employer) session.getAttribute("empAccount");
			
			long id=e.getPersonID();
			List<Job> jobList=jd.getListOfPostedJobs(id);
			model.addAttribute("jobList",jobList);
			
		}
		catch(Exception e){
			
		}
		return "employerhome1";
		
		
		
		
		
		
		
		
		
	}
	
	
	@RequestMapping(value = "/postjobmain", method = RequestMethod.POST)
    public String postjobmain(@ModelAttribute("job")Job job,BindingResult result,HttpServletRequest request, HttpServletResponse response,@ModelAttribute("employer") Employer employer,HttpSession session) {
    	
       //session=request.getSession();
      // String typeofjob=request.getParameter("typeofjob");
      // String title=request.getParameter("title");
      // session.setAttribute("typeofjob",typeofjob);
      // session.setAttribute("title",title);
       
       
        return "employeejob";
    }
	
	@RequestMapping(value = "/postjob", method = RequestMethod.GET)
    public String postjob(@ModelAttribute("job")Job job,BindingResult result,HttpServletRequest request, HttpServletResponse response,@ModelAttribute("employer") Employer employer) {
    	//Person user = (Person)request.getSession().getAttribute("postjob");
	   // session.setAttribute("users", new UserAccount());
    	//Person user=request.getSession("postjob",);
    //System.out.println(user.getFirstName());
    	//session.setAttribute("postjob",user);
    	//System.out.println(user);
		//model.addAttribute("combined",new Combined());
       //HttpSession session=request.getSession();
       
        return "employeejobpost";
    }
	
	

}


