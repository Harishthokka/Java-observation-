import java.util.Scanner;
class number
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		if(num==5)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		sc.close();
	}
}
