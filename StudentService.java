package Studentmanagement.service;
import Studentmanagement.model.Student;
public class StudentService 
{
    //method Overloading
	public void registerStudent(Student s)
	{
		System.out.println("registering Student: " + s.getName());
	}
	
	public void registerStudent(Student s, boolean showDetails)
	{
		System.out.println("registering student: " + s.getName());
		if(showDetails)
		{
			s.display();
		}
	}
}
