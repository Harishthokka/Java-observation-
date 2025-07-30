import java.util.Scanner;
class marks
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
		int num=sc.nextInt();
		if(num<=100 && num>=75)
		{
			System.out.println("A grade");
		}
		else if(num<75 && num>=50)
		{
			System.out.println("B grade");
		}
		else if(num<50 && num>=35)
		{
			System.out.println("C grade");
		}
		else
		{
			System.out.println("fail");
		}
		sc.close();
	}
}
