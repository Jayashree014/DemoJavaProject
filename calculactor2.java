package calculator;
public class calculactor2 extends calculator1
{
	calculactor2(double a, double b)
    {
    	super(a,b);
    }
    
    public double power()
    {
    	return Math.pow(getNum1(), getNum2());
    }
}
