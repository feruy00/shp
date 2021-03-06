package Student;

import java.util.ArrayList;

import ClassHistory.Course;
import Photo.Schedule;

public class ListManager {
	ListOfCourses Courses = new ListOfCourses();
	ListOfStudents Students = new ListOfStudents();
	
	
	public ListOfStudents getListOfStudents()
	{
		return this.Students;
	}
	
	public ListOfCourses getListOfCourses()
	{
		return this.Courses;
	}
	
	public void printStudents() {	
		for(Student student :this.Students.List) {
			System.out.println(student.toString());		
		}
		
	}
	
	public void printCourses() {	
		for(Course course :this.Courses.getList()) {
			System.out.println(course.toString());		
		}
	}
	
}
