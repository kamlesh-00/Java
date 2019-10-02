import java.util.*;
class String{
	public static void main(String args[])
	{	Scanner s=new Scanner(System.in);
		System.out.println("Strings inputs are "+args[0]+" "+args[1]);
		System.out.print("1.Append 2 in 1\n2.To insert a char or string in the previous string 2\n3.Replace char(s) from string 2\n4.Delete char(s) from the string 2\n5.Reverse a string 1\n6.Capacity of the both the StringBuffers\n7.To ensure capacity of String 1\n8.Character at in String 1\n9.Length of the String 2\n10.Use substring()\nEnter your choice:");
		int ch=s.nextInt();
		String c=args[0];
		String d=args[1];
		StringBuffer a=new StringBuffer(args[0]);
		StringBuffer b=new StringBuffer(args[1]);
		switch(ch)
		{
		case 1:{
		a.append(b);
		System.out.println("Appended String 1: "+a);
		break;
		}
		case 2:{
		b.insert(2,"YOYO");
		System.out.println("After insertion in String 2: "+b);
		break;
		}
		case 3:{
		b.replace(2,6,"BOBO");
		System.out.println("After replacing in String 2: "+b);
		break;
		}
		case 4:{
		b.delete(2,6);
		System.out.println("After from String 2: "+b);
		break;
		}
		case 5:{
		System.out.println("Reversed String 1: "+a.reverse);
		break;
		}
		case 6:{
		System.out.println("Capacity of String 1: "+a.capacity()+"\nCapacity of String 2: "+b.capacity());
		break;
		}
		case 7:{
		System.out.println("Ensuring their capacity as 50");
		a.ensureCapacity(50);
		b.ensureCapacity(50);
		System.out.println("Capacity of String 1: "+a.capacity()+"\nCapacity of String 2: "+b.capacity());
		break;
		}
		case 8:{
		System.out.println("character at index 5 in string 1 "+a.charAt(5));
		break;
		}
		case 9:{
		System.out.println("Length of String 1: "+a.length());
		break;
		}
		case 10:{
		System.out.println("Using substring(2,5) in String 1"+a.subString(2,5));
		break;
		}
		default:System.out.println("Wrong choice");
		}
	}
}