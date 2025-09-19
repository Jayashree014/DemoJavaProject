package Studentmanagement.model;
public class Student extends Person //inheritance 
{
   private String studentId;
   private String course;
   
   //constructor
   public Student(String name, int age, String studentId, String course)
   {
	   super(name, age);
	   this.studentId=studentId;
	   this.course=course;
   }
   
   //Overloading 
   public void setCourse(String course)
   { 
	   this.course=course;
   }
   
   public void setCourse(String course, boolean displaymessage)
   {
	   this.course=course;
	   if(displaymessage) 
	   {
		   System.out.println("course updated to: " +course);
	   }
   }
   
   //Overriding
   @Override
   public void display()
   {
	   System.out.println("student Id: "+ studentId + ", Name: " + getName() + ", Age: " + getAge() + ", course: " + course);
   }
}