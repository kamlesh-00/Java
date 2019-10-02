import java.util.*;
class MarksOutOfBoundsException extends Exception
{	MarksOutOfBoundsException()
	{	System.out.println("MarksOutOfBoundsException occurred");
	}
}

class Demo66
{	public static void main(String args[])
	{	Scanner s=new Scanner(System.in);
		System.out.print("Enter name:");
		String n=s.nextLine();
		System.out.print("Enter Seat No.:");
		int seat=s.nextInt();
		System.out.print("Enter date,month and year:");
		int date=s.nextInt();
		int month=s.nextInt();
		int year=s.nextInt();
		System.out.print("Enter center number:");
		int c=s.nextInt();
		System.out.print("Enter marks of three subjects:");
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nextInt();
		int sum=m1+m2+m3;
		try
		{	if((m1<0 || m1>100) || (m2<0 || m2>100) || (m3<0 || m3>100))
				throw new MarksOutOfBoundsException();
			else
				System.out.println("Name : "+n+"\nSeat no. : "+seat+"\nDate : "+date+"/"+month+"/"+year+"\nMarks of subjects : "+m1+"\t\t"+m2+"\t"+m3);
		}
		catch(MarksOutOfBoundsException e)
		{	System.out.println("Marks is out of bounds please check again");
		}
	}
}



/*Output:
C:\Users\Kamlesh\Desktop\Java>java Demo66
Enter name:Kamlesh Mistry
Enter Seat No.:9998
Enter date,month and year:27
09
2019
Enter center number:1555
Enter marks of three subjects:98
122
157
MarksOutOfBoundsException occurred
Marks is out of bounds please check again
*/