import java.util.*;
class Vec
{	public static void main(String args[])
	{	Scanner s=new Scanner(System.in);
		Vector<String> v=new Vector<String>();
		System.out.println("******Enter -1 to exit******");
		for(int i=0;!v.contains("-1");i++)
		{	System.out.print("Enter a string:");
			String b=s.next();
			if(v.contains(b))
			{	System.out.println("Removing "+b+" as it is already present in the Vector.");
				v.remove(b);
			}
			else
				v.add(b);
		}
		v.remove("-1");
		for(int j=0;j<v.size();j++)
		{	System.out.println((j+1)+": "+v.get(j));
		}
	}
}


/*Output:
C:\Users\Kamlesh\Desktop\Java>javac vect1.java

C:\Users\Kamlesh\Desktop\Java>java Vec
******Enter -1 to exit******
Enter a string:Kamlesh
Enter a string:Mistry
Enter a string:Nitu
Enter a string:Mistry
Removing Mistry as it is already present in the Vector.
Enter a string:Bhawarlal
Enter a string:Ankush
Enter a string:Meeral
Enter a string:Ankush
Removing Ankush as it is already present in the Vector.
Enter a string:-1
1: Kamlesh
2: Nitu
3: Bhawarlal
4: Meeral
*/