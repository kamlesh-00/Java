import java.util.*;
class Mat
{	int[][] add(int[][] a, int[][] b, int m, int n)
	{	int[][] c=new int[10][10];
		for(int i=0;i<m;i++)
		{	for(int j=0;j<n;j++)
				c[i][j]=a[i][j]+b[i][j];
		}
		return (c);
	}
	int[][] multi(int[][] a, int[][] b, int m, int n)
	{	int[][] c=new int[10][10];
		for(int i=0; i<m; i++)
		{	for(int j=0; j<n; j++)
				{	c[i][j]=0;
					for(int k=0; k<n; k++)
						c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
		}
		return c;
	}
}

class Demo
{	public static void main(String args[])
	{	Scanner s=new Scanner(System.in);
		Mat x=new Mat();
		int[][] a=new int[10][10];
		int[][] b=new int[10][10];
		int[][] c=new int[10][10];
		System.out.print("Enter no. of rows and columns:");
		int m=s.nextInt();
		int n=s.nextInt();
		System.out.println("Enter elements for matrix 1:");
		for(int i=0; i<m; i++)
		{	for(int j=0; j<n; j++)
				a[i][j]=s.nextInt();
		}
		System.out.println("Enter elements for matrix 2:");
		for(int i=0; i<m; i++)
		{	for(int j=0; j<n; j++)
				b[i][j]=s.nextInt();
		}
		System.out.println("Enter 1.To add both matrices\n2.To multiply both matrices\nEnter your option:");
		int ch=s.nextInt();
		switch(ch)
		{	case 1:
			{	c=x.add(a,b,m,n);
				System.out.println("Addition of two matrices is as follows:");
				for(int i=0; i<m; i++)
				{	for(int j=0; j<n; j++)
						System.out.print(c[i][j]+"\t");
					System.out.println("");
				}
				break;
				}
			case 2:
			{	c=x.multi(a,b,m,n);
				System.out.println("Multiplication of the matrices is as follows:");
				for(int i=0; i<m; i++)
				{	for(int j=0; j<n; j++)
						System.out.print(c[i][j]+"\t");
					System.out.println("");
				}	
				break;
			}	
		}
	}
}