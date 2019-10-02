import java.util.*;
class Cons
{	int roll,age;
	String name;
	Cons()
	{	roll=8686;
		age=19;
		name="Kamlesh";
	}
	Cons(int r)
	{	this();
		roll=r;
	}
	Cons(String n,int r, int a)
	{	this();
		name=n;
		roll=r;
		age=a;
	}
	public static void main(String args[])
	{	Scanner s=new Scanner(System.in);
		Cons a=new Cons();
		System.out.println("Roll No.:"+a.roll+"\nAge:"+a.age+"\nName:"+a.name);
		System.out.print("Enter New Roll No.:");
		int r=s.nextInt();
		Cons b=new Cons(r);
		System.out.println("Roll No.:"+b.roll+"\nAge:"+b.age+"\nName:"+b.name);
		System.out.print("Enter new Name, new Roll No. and new Age:");
		String n=s.next();
		int m=s.nextInt();
		int o=s.nextInt();
		Cons c=new Cons(n,m,o);
		System.out.println("Roll No.:"+c.roll+"\nAge:"+c.age+"\nName:"+c.name);
	}
}
		
		