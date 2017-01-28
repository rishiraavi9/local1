package com.neu.webtools.dao;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.neu.webtools.pojo.Employer;
import com.neu.webtools.pojo.JobSeeker;
import com.neu.webtools.pojo.JobsApplied;
import com.neu.webtools.pojo.Person;


import com.neu.webtools.pojo.Job;

public class JobDao extends DAO {
	public Job postJob(String industry, String jobTitle, String experience, String jobFunction,String jobDescription,String userName,String companyName,String location)
	        throws Exception {
	    try {
	        begin();
	        System.out.println("inside DAO");
	        
	       //PersonDao personDao=new PersonDao();
	        
	        Job job=new Job();
	        job.setIndustry(industry);
	        job.setJobDescription(jobDescription);
	        job.setJobFunction(jobFunction);
	        job.setJobTitle(jobTitle);
	        job.setExperience(experience);
	        job.setCompanyName(companyName);
	        job.setLocation(location);
	        job.setDate(new Date());
	        
	        //Employer e1=personDao.get(userName);
	        
	        Query q = getSession().createQuery("from Employer where userName = :userName");
	        //System.out.println("risssssssssssssss"+userName);
	        q.setString("userName", userName);
	      
	        Employer e1 = (Employer) q.uniqueResult();        
	    	
	    	
	    	job.setEmployer(e1);
	    	
	    	//e1.addJob(job);
	    	getSession().save(job);
	
	       
	       
	        
	       // user.setFirstName(firstName);
	        //user.setLastName(lastName);
	        
	        //user.setEmail(email);
	        
	        //email.setUser(user);
	        
	        //getSession().save(job);
	       //getSession().save(job);
	        
	        
	        
	        commit();
	        return job;
	    } catch (HibernateException e) {
	        rollback();
	        //throw new AdException("Could not create user " + username, e);
	        throw new Exception("Exception while creating user: " + e.getMessage());
	    }
	}

	public void updateResume(int personID, Blob blob, String originalFilename, String contentType) {
		begin();
		Query q = getSession().createQuery("from JobSeeker where personID = :personID");
		 q.setInteger("personID",personID);
		 
		 JobSeeker j = (JobSeeker) q.uniqueResult(); 
		 
		 j.setContent(blob);
		 j.setFileName(originalFilename);
		 j.setFileType(contentType);
		 
		 getSession().update(j);
		 commit();
		
	}

	public void apply(long userId, long jobId) {
		// TODO Auto-generated method stub
		JobsApplied ja=new JobsApplied();
		try{
			begin();
			Query q=getSession().createQuery("from JobSeeker where personID=:personID");
			q.setLong("personID",userId);
			
		
			
			JobSeeker js=(JobSeeker) q.uniqueResult();
			System.out.println(userId+"Person Id");
			
			
			
			Query query=getSession().createQuery("from Job where id=:jobId");
			query.setLong("jobId",jobId);
			
			Job j=(Job) query.uniqueResult();
			System.out.println(jobId);
			
			ja.setStatus("Applied");
			ja.setJob(j);
			ja.setJobseeker(js);
			ja.setFileName(js.getFileName());
			ja.setFileType(js.getFileType());
			ja.setContent(js.getContent());
			ja.setDate(new Date());
			
			
			//getSession().update(js);
			//getSession().update(j);
			getSession().save(ja);
			commit();
			System.out.println(ja.getStatus());
			
		}
		catch(Exception e){
			e.printStackTrace();
			rollback();
			
			
			
		}
		
	}

	public List<JobsApplied> getApplicant(long userId, long jobId) {
		JobsApplied ja=new JobsApplied();// TODO Auto-generated method stub
		
		List<JobsApplied> applicants=new ArrayList<JobsApplied>();
		
		
		try{
			begin();
			Query q=getSession().createQuery("from Job where jobId=:jobId");
			q.setLong("jobId",jobId);
			
			Job j=(Job) q.uniqueResult();
			
			Query qu=getSession().createQuery("from JobsApplied where job=:j");
			qu.setLong("j", jobId);
			
			applicants=qu.list();
					
			commit();
			
		}
		catch(Exception e){
			rollback();
		}
		
		return applicants;
	}

	public JobsApplied getjaresume(long documentId) {
		// TODO Auto-generated method stub
		JobsApplied j=new JobsApplied();
		try{
			
			begin();
			Query q=getSession().createQuery("from JobsApplied where id=:documentId");
			q.setLong("documentId",documentId);
			 j=(JobsApplied) q.uniqueResult();
			 
			 commit();
			
		}
		catch(Exception e){
			e.printStackTrace();
			rollback();
		}
		
		return j;
		
	}

	public List<Job> getListOfPostedJobs(long id) {
		List<Job> jobs=new ArrayList<Job>();
		try{begin();
		Query q=getSession().createQuery("from Job where personID=:id");
		q.setLong("id",id);
		jobs=q.list();
		commit();
		
		}
		catch(Exception e){
			e.printStackTrace();
			rollback();
			
		}
		return jobs;
		
	}

	public JobsApplied retrieveJobsApplied(long jobsAppliedID) {
		JobsApplied ja=new JobsApplied();
		try{
			begin();
			Query q=getSession().createQuery("from JobsApplied where jobsAppliedID=:jobsAppliedID");
			q.setLong("jobsAppliedID",jobsAppliedID);
			ja=(JobsApplied) q.uniqueResult();
			commit();
		}
		catch(Exception e){
			e.printStackTrace();
			rollback();
			
		}
		
		
		
		return ja;
		// TODO Auto-generated method stub
		
	}

	public void change(String status,String message,long jobsAppliedID) {
		
		JobsApplied jd=new JobsApplied();
		
		try{
			begin();
			Query q=getSession().createQuery("from JobsApplied where jobsAppliedID=:jobsAppliedID");
			q.setLong("jobsAppliedID", jobsAppliedID);
			jd=(JobsApplied) q.uniqueResult();
			jd.setStatus(status);
			jd.setMessage(message);
			jd.setDate(new Date());
			
			getSession().update(jd);
			
			
			commit();
			
		}
		catch(Exception e){
			e.printStackTrace();
			rollback();
		}
	
		
	}
	
	public Boolean applyCheck(long jobId) throws Exception{
		
		
		ArrayList<JobsApplied> ja = new ArrayList();
		Query q = getSession().createQuery("from JobsApplied where id=:jobId ");
		q.setLong("jobId", jobId);
		
		ja = (ArrayList<JobsApplied>)q.list();
		for(JobsApplied u:ja){
			//System.out.println("given"+person.getUserName()+"actual"+u.getUserName());
			if(u.getStatus().equalsIgnoreCase("Applied")){
				//model.addAttribute("error", "");
				
				return false;
			}
		}
		return true;

	}

	public List<JobsApplied> getApplied(int personID) {
		// TODO Auto-generated method stub
		List<JobsApplied> jb=new ArrayList<JobsApplied>();
		try{
			begin();
			
			Query q=getSession().createQuery("from JobsApplied where jobseeker=:personID");
			q.setLong("personID",personID);
			
			jb=q.list();
			commit();
			
		}
		catch(HibernateException e){
			e.printStackTrace();
			rollback();
			
		}
		return jb;
	}

	public List<JobsApplied> viewAppliedJobs(long id) {
		
		List<JobsApplied> jb=new ArrayList<JobsApplied>();
		try{
			begin();
			
			Query q=getSession().createQuery("from JobsApplied where jobseeker=:id");
			q.setLong("id",id);
			
			jb=q.list();
			commit();
			
		}
		catch(HibernateException e){
			e.printStackTrace();
			rollback();
			
		}
		return jb;
	}

	public JobSeeker getDetails(long id) {
		// TODO Auto-generated method stub
		JobSeeker j=new JobSeeker();
		try{
			
			begin();
			Query q=getSession().createQuery("from JobSeeker where personID=:documentId");
			q.setLong("documentId",id);
			 j=(JobSeeker) q.uniqueResult();
			 System.out.println("usename: "+ j.getFirstName());
			 commit();
			
		}
		catch(Exception e){
			e.printStackTrace();
			rollback();
		}
		
		return j;
		
	}

	public void deleteJob(long jobId) {
		try{
			begin();
			Query q=getSession().createQuery("delete from Job where id=:jobId");
			q.setLong("jobId", jobId);
			q.executeUpdate();
			
			commit();
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			rollback();
		}
		
	}

	

	public Boolean resumeCheck(long personID) {
JobSeeker js=new JobSeeker();
		try{
			//ArrayList<JobSeeker> users = new ArrayList();
		Query q = getSession().createQuery("from JobSeeker where personID=:personID");
		q.setLong("personID", personID);
		
		js = (JobSeeker)q.uniqueResult();
		
		System.out.println("file name +"+js.getFileName()+"+");
		System.out.println("out Dao");
			if(js.getFileName()!=null){
				//model.addAttribute("error", "");
				System.out.println("in Dao");
				return true;
			}
			
		
	}
	catch(Exception e){
		
		
	}
		return false;

	}
public List jobsPosted(){
	List<Job> job=new ArrayList<Job>();
	try{
		Query q=getSession().createQuery("select personID, count(jobId)  from Job group by personID");
		
		job=q.list();
		
		System.out.println("Count"+job);
	}
	catch(Exception e){
		
		
	}
	
	
	return job;
	
	
}	
public void testSimpleGroupBy() {
   
	
	System.out.println("Total entities under Master with id  before ***" );
    Query q = getSession().createQuery("select count(jobId), personID from " +
            "Job group by personID");
    List<Job[]> recs = q.list();
    for (Job[] line : recs) {
        System.out.println("Total entities under Master with id " + line[1] + " is " + line[0]);
    }
}


}
	
	
	

