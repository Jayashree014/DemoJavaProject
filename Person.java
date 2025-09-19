package Studentmanagement.model;
public class Person //encapsulation
{
    private String name;
    private int age;
    
    //Constructor for object initialization
    public Person(String name, int age)
    {
    	this.name=name;
    	this.age=age;
    }
    
    //Getter & Setter (Encapsulation)
    public String getName()
    {
    	return name;
    }
   
    public int getAge()
    {
    	return age;
    }
    
    //Method to be override
    public void display() {
    	System.out.println("name: "+ name + ", age: " + age);
    }
}
