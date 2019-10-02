import java.util.*;
class Demo1{
public static void main(String args[])
{	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your number of subjects:");
	float s=sc.nextFloat();
	float a[]=new float[s];
	float highest=0;
	a[0]=sc.nextFloat();
	float avg=a[0]/s;
	for(int i=0;i<s-1;i++)
	{	a[i+1]=sc.nextFloat();
		if(a[i]<a[i+1])
			highest=a[i+1];
		avg=avg+a[i+1]/s;
	}
	System.out.println("Highest scored is "+highest+" and average score is "+avg);
}
}