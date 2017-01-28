package com.neu.webtools.pojo;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class JobsApplied {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="jobsAppliedID",unique=true,nullable=false)
    private long id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private Job job;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="personID")
	private JobSeeker jobseeker;
	
	@Column
	public String status;
	
	@Column(name="message")
	private String message;
	
	@Column(name="date")
	private Date date;
	
	
	
	@Column(name="fileName")
	private String fileName;
	
	@Column(name="fileType")
	private String fileType;
	
	 @Column(name="content")
	    @Lob
	    private Blob content;
	
	 public JobsApplied(){}
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public JobSeeker getJobseeker() {
		return jobseeker;
	}

	public void setJobseeker(JobSeeker jobseeker) {
		this.jobseeker = jobseeker;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public Blob getContent() {
		return content;
	}

	public void setContent(Blob content) {
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
	

}
