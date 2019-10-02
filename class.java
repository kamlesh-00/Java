import java.util.*;
abstract class Instrument
{	void play(){}
}

class Piano extends Instrument
{	void play()
	{	System.out.println("Piano is playing tan tan tan tan");
	}
}
class Flute extends Instrument
{	void play()
	{	System.out.println("Flute is playing toot toot toot toot");
	}
}
class Guitar extends Instrument
{	void play()
	{	System.out.println("Guitar is playing tin tin tin tin");
	}
} 

class Class
{	public static void main(String args[])
	{	Instrument[] a=new Instrument[10];
		int i=0;
		while(i<3)
		{	a[i]=new Piano();
			i++;
		}
		while(i<6)
		{	a[i]=new Flute();
			i++;
		}
		while(i<10)
		{	a[i]=new Guitar();
			i++;
		}
		for(int j=0;j<10;j++)
			a[j].play();
	}
}