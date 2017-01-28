package com.neu.webtools.pojo;

import java.sql.Blob;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



import javax.persistence.JoinColumn;



@Entity
@Table
@PrimaryKeyJoinColumn(name="personID")
public class JobSeeker extends Person{
	
	
	
	
	
	
	@OneToMany(mappedBy="jobseeker")
	private Set<JobsApplied> ja=new HashSet<JobsApplied>();
	
	
	
	@Column(name="currentPosition")
	private String currentPosition;
	
	@Column(name="city")
	private String city;
	
	@Column(name="fileName")
	private String fileName;
	
	@Column(name="fileType")
	private String fileType;
	
	 @Column(name="content")
	    @Lob
	    private Blob content;
	
	
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

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(String currentPosition) {
		this.currentPosition = currentPosition;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


	public Set<JobsApplied> getJa() {
		return ja;
	}


	public void setJa(Set<JobsApplied> ja) {
		this.ja = ja;
	}

public JobSeeker(){}
	
	
	public JobSeeker(String city, String currentPostion){
		
		this.city=city;
		this.currentPosition=currentPostion;
		
	}
	
	
	

}
