import java.util.*;
class even
{	
	public static void main(String args[])
	{
		int no;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
		no=sc.nextInt();

		if(no%2==0)
		{	
			System.out.println("no is even"+no);
		}
		else
		{
			System.out.println("no is odd"+no);
		}
	}
}