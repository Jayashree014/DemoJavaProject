package calculator;
//import java.util.Scanner;
public class calculator1 
{
   private double num1;
   private double num2;
   
   calculator1(double num1, double num2)
   {
	   this.num1=num1;
	   this.num2=num2;
   }
   
   //getter and setter
   public double getNum1()
   {
	   return num1;
   }
   public void setNum1(double num1)
   {
	   this.num1=num1;
   }
   public double getNum2()
   {
	   return num2;
   }
   public void setNum2(double num2)
   {
	   this.num2=num2;
   }
   
  //operation
   public double add()
   {
	   return num1+num2;
   }
   public double sub()
   {
	   return num1-num2;
   }
   public double mul()
   {
	   return num1*num2;
   }
   public double div()
   {
	   return num1/num2;
   }
}
