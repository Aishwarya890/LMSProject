package com.lms.entity;


import org.hibernate.annotations.ManyToAny;
import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;

@Entity
public class TablSubject {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String subjectCode;
	private String subjectName;
	private String teacherName;
	private String className;
	private char division;
	private String description;
	private int credit;
	 private String file;
	 private boolean status;
	 
	 
//	 @ManyToAny
//	 @JoinColumn(name="studentId", referencedColumnName = "id")
//	 private Student student;
	 
	public String getSubjectCode() {
		return subjectCode;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public char getDivision() {
		return division;
	}
	public void setDivision(char division) {
		this.division = division;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String fileName) {
		this.file = fileName;
	}
	
	
	public TablSubject(Long id, String subjectCode, String subjectName, String teacherName, String className,
			char division, String description, int credit, String file, boolean status) {
		super();
		this.id = id;
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.teacherName = teacherName;
		this.className = className;
		this.division = division;
		this.description = description;
		this.credit = credit;
		this.file = file;
		this.status = status;
	}
	public TablSubject() {
		super();
	}
	@Override
	public String toString() {
		return "TablSubject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", teacherName="
				+ teacherName + ", className=" + className + ", division=" + division + ", description=" + description
				+ ", credit=" + credit + "]";
	}
	
	

}
