import java.util.Scanner;
class while
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.printl("eneter num");
		int num=sc.nextInt();
		while(num>=7)
		{
			System.out.println(num);
			num++;
		}
		sc.close();
	}
}
