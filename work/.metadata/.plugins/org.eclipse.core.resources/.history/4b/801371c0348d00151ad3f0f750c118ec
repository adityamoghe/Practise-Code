package com.yash.training.tmp.service;



import com.yash.training.tmp.domain.Courses;
import com.yash.training.tmp.util.DBUtil;

/**
 * Session Bean implementation class CourseService
 */
@Stateless
@LocalBean
public class CourseService implements CourseServiceLocal {

	/**
	 * Default constructor.
	 */
	public CourseService() {
		// TODO Auto-generated constructor stub
	}

	public void saveCourses(Courses courses) {
		// TODO Auto-generated method stub

		String query = "INSERT INTO COURSES (COURSE_TITLE,DESCRIPTION,REFERENCE_CODE,IMAGE,STATUS) VALUES ('"
				+ courses.getCourseTitle() + "','" + courses.getDescription() + "','" + courses.getReferenceCode()
				+ "','" + courses.getImage() + "','" + courses.getStatus() + "') ";
		
		DBUtil.update(query);

	}

}
