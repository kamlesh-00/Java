import java.util.*;

class Excep{
public void check(float n) throws Exception
{	if(n<8000)
		throw new PayOutOfBoundsException();
	else
		System.out.println("Your total salary is Rs."+n);
}
public static void main(String args[])
{	Scanner s=new Scanner(System.in);
	System.out.println("Enter DA,HRA,CA,TA,Professional Tax.TDS,PF:");
	float da=s.nextFloat();
	float hra=s.nextFloat();
	float ca=s.nextFloat();
	float ta=s.nextFloat();
	float pt=s.nextFloat();
	float tds=s.nextFloat();
	float pf=s.nextFloat();
	float sum=da+hra+ca+ta+pt+tds+pf;
	Excep e=new Excep();
	e.check(sum);
}
}

class PayOutOfBoundsException extends Exception
{	public PayOutOfBoundsException()
	{	System.out.println("Sum of all amounts should be atleast Rs.8000");
	}
}