package Studentmanagement.main;
import Studentmanagement.model.Student;
import Studentmanagement.model.Teacher;
import Studentmanagement.service.StudentService;
public class Studentmaincls 
{
     public static void main(String[]args)
     {
    	 //object initialization
    	 Student s1=new Student("Arjun", 20, "s101", "computer science");
    	 Teacher t1=new Teacher("Meena", 35, "Java programming");
    	 //Overriding (display different in student and teacher)
    	 s1.display();
    	 t1.display();
    	 //method Overloading (setCourse)
    	 s1.setCourse("Data Science", true);
    	 //using service class
    	 StudentService service=new StudentService();
    	 service.registerStudent(s1, true);
     }
}
