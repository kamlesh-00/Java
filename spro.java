import java.util.*;
class Spro
{	public static void main(String args[])
	{	Scanner s=new Scanner(System.in);
		System.out.print("Enter a string to be checked:");
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
	}
}