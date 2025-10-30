package calculator;
import java.util.Scanner;
public class maincalculactor 
{
	public static void main(String[]args)
    {
    	@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
    	String choice="yes";
    	do {
    	System.out.println("enter number1:");
    	double a=scn.nextDouble();
    	System.out.println("enter number2:");
    	double b=scn.nextDouble();
    	calculactor2 c1 = new calculactor2(a,b);
    	System.out.println("operation(add, sub, mul, div, pow): ");
    	String option=scn.next().toLowerCase();
    	double result = 0;
    	boolean valid=true;
    	switch (option)
    	{
    	    case "add":
    	    	result = c1.add();
    	        break;  
    	     
    	    case "sub": 
    		    result = c1.sub();
	            break;
	           
    	    case "mul":
    	    	result = c1.mul();
    	        break;
    	        
    	    case "div":
    	    	result = c1.div();
    	        break;
    	 
    	    case "pow":
    	    	result = c1.power();
    	    	break;
    	    default:
    	    	System.out.println("invalid");
    	    	
    	    	valid = false;
    	}
    	if(valid)
    	{
    		System.out.println("result:" +result);
    	System.out.println("Do you want to continue?(yes/no): ");
    	choice=scn.next().toLowerCase();
    	}
    }
    	while (choice.equals("yes"));
        System.out.println("Thank you for using oops calculator!");
    }
}
