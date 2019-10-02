import java.util.*;
class Rec
{	int sum=0;
	int reve(int n)
	{	int re=n%10;

		n=n/10;

		sum=sum*10+re;

		if(n!=0)
	
			return reve(n);

		else

			return sum;
	}
	int sum(int n)
	{	if(n==0)
			return 0;
		else
			return(n+sum(n-1));
	}
	public static void main(String args[])
	{	Scanner s=new Scanner(System.in);
		System.out.print("***Recursive Functions***\n1.To find reverse of a number\n2.To find the sum of a series\nEnter your option:");
		int ch=s.nextInt();
		Rec r=new Rec();
		switch(ch)
		{	case 1:
			{	System.out.print("Enter a number:");
				int n=s.nextInt();
				int rev=r.reve(n);
				System.out.println("Reverse of a entered number is "+rev);
				break;
			}
			case 2:
			{	System.out.print("Enter the number of terms:");
				int n=s.nextInt();
				int sum=r.sum(n);
				System.out.println("Sum of the series is "+sum);
				break;
			}
			default:
				System.out.println("Incorrect choice");
				break;
		}
	}
}