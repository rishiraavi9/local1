package com.neu.webtools;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.Document;

import org.apache.commons.io.IOUtils;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import com.neu.webtools.dao.JobDao;
import com.neu.webtools.dao.PersonDao;

import com.neu.webtools.pojo.Employer;
import com.neu.webtools.pojo.Job;
import com.neu.webtools.pojo.JobSeeker;
import com.neu.webtools.pojo.JobsApplied;






@Controller
public class JobSeekerController {
	
	@RequestMapping(value = "deletejob/{id}", method = RequestMethod.GET)
	public String deleteJob(@PathVariable("id")long jobId,HttpServletRequest req){
	try{
		
		JobDao jd=new JobDao();
		
		jd.deleteJob(jobId);

		
		
		
		
	}
	catch(Exception e){
		
	}
	return "employerhome";
	
		
}
	@RequestMapping(value = "/viewprofile.htm", method = RequestMethod.GET)
	public String viewandupdate(@ModelAttribute("update")JobSeeker js,BindingResult result,HttpServletRequest req,Model model,HttpServletResponse res){
		JobDao jd=new JobDao();
		
		JobSeeker e=(JobSeeker) req.getSession().getAttribute("jobseekerAccount");
		
		long id=e.getPersonID();
		
		JobSeeker j=(JobSeeker)jd.getDetails(id);
		
		//List<JobsApplied> jA=jd.viewAppliedJobs(id);
		model.addAttribute("js",j);
		
		System.out.println(j.getFirstName());
		System.out.println(j.getLastName());
		
		
		
		
		return "viewAndUpdateProfile";
	}
	@RequestMapping(value = "/viewAppliedJobs.htm", method = RequestMethod.GET)
	public String viewAppliedJobs(HttpServletRequest req,Model model){
		JobDao jd=new JobDao();
		
		JobSeeker e=(JobSeeker) req.getSession().getAttribute("jobseekerAccount");
		
		long id=e.getPersonID();
		
		List<JobsApplied> jA=jd.viewAppliedJobs(id);
		model.addAttribute("jobsApplied",jA);
		
		
		
		
		return "viewAppliedJobs";
	}
	@RequestMapping(value = "viewapplicants/{id}", method = RequestMethod.GET)
	public String applyJob(@PathVariable("id")long jobId,HttpServletRequest req,Model model){
	try{
		
		JobDao jd=new JobDao();
		
		Employer e=(Employer) req.getSession().getAttribute("empAccount");
		
		long userId=e.getPersonID();
		
		List<JobsApplied> applicants=new ArrayList();
		applicants=jd.getApplicant(userId,jobId);
		
		req.getSession().setAttribute("applicants", applicants);
		if(applicants.size()!=0){
			return "viewApplicants";
			
			
		}
		else{
			model.addAttribute("error",true);
			
			return "noapplicants";
		}
		
		
		
		
		
	}
	catch(Exception e){
		return null;
	}
	
		
}
	
	
	@RequestMapping(value = "/profile.htm", method = RequestMethod.GET)
	public String profile(Model model){
		
		
		
		return "jobseekerprofile";
	}
	  
	@RequestMapping(value = "/homejobseeker.htm", method = RequestMethod.GET)
    public String reg(@ModelAttribute("jobseeker") JobSeeker jobseeker,Model model,BindingResult result,HttpSession session) {
    	//HttpSession session = request.getSession();
	   // session.setAttribute("users", new UserAccount());
    	JobSeeker jb=(JobSeeker) session.getAttribute("jobseekerAccount");
		//model.addAttribute("combined",new Combined());
    	PersonDao persondao=null;
    	//=new PersonDao();
    	List empList = null;
    	List jobList = new ArrayList();
    	//Delete Accepted Jobs
    	List<Job> jList=new ArrayList<Job>();
    	List<JobsApplied> jalist=new ArrayList<JobsApplied>();
    	List<JobsApplied> jblist=new ArrayList<JobsApplied>();
    	
    	try{
    		persondao = new PersonDao();
    		empList = persondao.list();
    		
    		Iterator empIterator = empList.iterator();
    		while (empIterator.hasNext())
            {
    		Employer employer=	(Employer) empIterator.next();
    		Iterator jobIterator = employer.getJobs().iterator();
    		while (jobIterator.hasNext())
            {
                Job job = (Job) jobIterator.next();
                jobList.add(job);
                jList.add(job);
                
                System.out.println(jobList.size());
                System.out.println(jobList.size());
               
               
            }
    			
            }
    		System.out.println(jList.size());
            JobDao jd=new JobDao();
            List<JobsApplied> jobsApp=new ArrayList<JobsApplied>();
            
            jobsApp=jd.getApplied(jb.getPersonID());
    		
    		Iterator appJob=jobsApp.iterator();
    		while(appJob.hasNext()){
    			JobsApplied jba=(JobsApplied) appJob.next();
    			jblist.add(jba);
    			
    			
    		}
    		
    		Iterator<Job> jbI=jList.iterator();
    		while(jbI.hasNext()){
    			Job jb1=jbI.next();
    			for(JobsApplied ja:jblist){
    				if(jb1.getId()==ja.getJob().getId()){
    			
    					jbI.remove();
    				}
    				
    				
    			}
    			
    		}
    		System.out.println(jList.size());
    		 model.addAttribute("joblist", jList);
    		 
    	}
    	catch (Exception e) {
            System.out.println(e.getMessage());
        }

    	
    	 
        return "jobseekerhomehome";
    }
	
	@RequestMapping(value = "/usersignup.htm", method = RequestMethod.GET)
    public String register(@ModelAttribute("jobseeker") JobSeeker jobseeker,BindingResult result) {
    	//HttpSession session = request.getSession();
	   // session.setAttribute("users", new UserAccount());
    	
		//model.addAttribute("combined",new Combined());
        
        return "usersignup";
    }
	
	@RequestMapping(value="download/{jaid}",method = RequestMethod.GET)
    public String download(@PathVariable("jaid")
            long documentId, HttpServletResponse response) {
		System.out.println("I m here");
		JobDao jd=new JobDao();
		System.out.println(documentId);
		JobsApplied j=(JobsApplied)jd.getjaresume(documentId);
		System.out.println(j.getFileName());
		try {
            response.setHeader("Content-Disposition", "inline;filename=\"" +j.getFileName()+ "\"");
            OutputStream out = response.getOutputStream();
            response.setContentType(j.getFileType());
            IOUtils.copy(j.getContent().getBinaryStream(), out);
            out.flush();
            out.close();
         
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
         
         
        return null;
		
		
		
	}
	@RequestMapping(value = "resume.htm", method = RequestMethod.POST)
	    public String save(            
	            @RequestParam("fileName") MultipartFile file,HttpSession session,Model model) {
	         
	         
	       // System.out.println("Name:" + document.get);
	       // System.out.println("Desc:" + document.getDescription());
	        System.out.println("File:" + file.getName());
	        System.out.println("ContentType:" + file.getContentType());
	         JobSeeker js=(JobSeeker) session.getAttribute("jobseekerAccount");
	        try {
	            Blob blob =(Blob) Hibernate.createBlob(file.getInputStream()); //Hibernate.createBlob(file.getInputStream());
	 JobDao jd=new JobDao();
	 
	 jd.updateResume(js.getPersonID(),blob,file.getOriginalFilename(),file.getContentType());
	           // document.setFileName(file.getOriginalFilename());
	            //document.setContent(blob);
	           // document.setContentType(file.getContentType());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	         
	        model.addAttribute("error",true);
	        return "jobseekerprofile";
	    }
	 
	 
	 
	         
	    }

