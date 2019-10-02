import java.util.*;

class Answer{
	Answer()
	{	System.out.println("You got nothing.");
	}
	Answer(int m,String s)
	{	this();
		System.out.println("You got "+m+" for an "+s);
	}
}
class Question{
	public static void main(String args[])
	{	Answer a=new Answer(10,"MCQ");
	}
}