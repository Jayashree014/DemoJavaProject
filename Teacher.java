package Studentmanagement.model;
public class Teacher extends Person // another subclass for Inheritance
{
    private String subject;
    public Teacher(String name, int age, String subject)
    {
    	super(name, age);
    	this.subject=subject;
    }
    
    @Override
    public void display()
    {
    	System.out.println("Teacher name: " + getName() + ", Age: " + getAge() + ", subject: " + subject);
    }
}
