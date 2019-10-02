import java.util.*;
class Tpro
{	public static void main(String args[])
	{	Scanner s=new Scanner(System.in);
		System.out.println("Enter 1.To find factorial\n2.To find reverse\n3.To test ArmStrong Number\n4.To test pallindrom\n5.To test prime number\n6.To get fibonacci series\nEnter your potion:");
		int ch=s.nextInt();
		switch(ch)
		{	case 1:
			{	System.out.print("Enter a number:");
				int a=s.nextInt();
				int fact=1;
				for(int i=1;i<=a;i++)
					fact*=i;
				System.out.println("factorial of a number is "+fact);
				break;
			}
			case 2:
			{	System.out.print("Enter a number:");
				int a=s.nextInt();
				int rev=0,n;
				while(a!=0)
				{	n=a%10;
					a=a/10;
					rev=rev*10+n;
				}
				System.out.println("Reverse of a number is "+rev);
				break;
			}
			case 3:
			{	System.out.print("Enter a number:");
				int a=s.nextInt();
				int b=a;
				int n=0,arm=0;
				while(b!=0)
				{	n=b%10;
					b=b/10;
					arm=arm+n*n*n;
				}
				if(arm==a)
					System.out.println("Number is armstrong");
				else
					System.out.println("Number is not armstrong");
				break;
			}
			case 4:
			{	System.out.print("Enter a string:");
				String a=s.next();
				int flag=0;
				char[] b=a.toCharArray();
				for(int i=0,j=a.length()-1;(i<a.length()/2&j>a.length()/2);i++,j--)
				{	if(b[i]!=b[j])
					{	flag=1;
						break;
					}
				}
				if(flag==1)
				System.out.println("String is not pallindrome");
				else
				System.out.println("String is pallindrome");
				break;
			}
			case 5:
			{	System.out.print("Enter a number:");
				int a=s.nextInt();
				int i;
				for(i=2;i<=a;i++)
				{	if(a%i==0)
						break;
				}
				if(a==i)
					System.out.println("It is a prime number");
				else
					System.out.println("Number is not a prime number");
				break;
			}
			case 6:
			{	System.out.print("Enter the number of terms:");
				int n=s.nextInt();
				int a=0,b=1,c;
				System.out.print(a+"\t"+b+"\t");
				for(int i=3;i<=n;i++)
				{	c=a+b;
					a=b;
					b=c;
					System.out.print(c+"\t");
				}
				break;
			}					
		}
	}			
}