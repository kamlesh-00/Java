import java.util.*;
class Demo{
public static void main(String args[])
{	Scanner s=new Scanner(System.in);
	System.out.println("Enter number of even elements:");
	int n=s.nextInt();
	int sum=0, i;
	for(i=0;i<(2*n+1);i+=2)
	{	if(i%3==0)
			sum+=i;
	}
	System.out.println("Sum of the even numbers divisible by 3 is "+sum);
}
}