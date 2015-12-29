package com.yash.training.tms.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.yash.training.tmp.domain.Courses;
import com.yash.training.tmp.service.CourseService;

@ManagedBean
@SessionScoped
public class CoursesBean {

	String courseTitle;
	String description;
	String referenceCode;
	String status;
	String image;

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReferenceCode() {
		return referenceCode;
	}

	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public String save(){
		
		Courses courses = new Courses();
		CourseService courseService =new CourseService();
		
		courses.setCourseTitle(courseTitle);
		courses.setDescription(description);
		courses.setImage(image);
		courses.setReferenceCode(referenceCode);
		courses.setStatus(status);
		System.out.println(courseTitle);
		System.out.println(description);
		System.out.println(courses);
		courseService.saveCourses(courses);
		
		return "homemaincontent";
		
		
		
	}
	
}
