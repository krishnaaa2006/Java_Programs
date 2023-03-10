import java.util.*;

class Addition
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition"+c);
	}
	void add(float a,float b)
	{
		float d=a+b;
		System.out.println("Addition"+d);
	}
}
class demo
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int p,q;
		float m,n;
		Addition x=new Addition();
		
		System.out.println("Enter two Int num");
		p=sc.nextInt();
		q=sc.nextInt();

		x.add(p,q);
		System.out.println("Enter two float num");
		m=sc.nextFloat();
		n=sc.nextFloat();
		
		x.add(m,n);
	}
}
								
		
