import java.util.Scanner;
class nestedif
{
public static void main(String[] args)
{
	Scanner x=new Scanner(System.in);
	System.out.println("enter a");
	int a=x.nextInt();
	System.out.println("enter b");
	int b=x.nextInt();
	System.out.println("enter c");
	int c=x.nextInt();
	if(a<b)
	{
		if(b<c)
		{
			System.out.println("c is greatest");
		}
		else
		{
			System.out.println("b is greatest");
		}
		
	}
	else
	{
		if(a<c)
		{
			System.out.println("c is greatest");
		}
		else
		{
			System.out.println("a is greatest");
		}
	}
	x.close();
}
}

