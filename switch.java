import java.util.Scanner;
class marks
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		switch(num)
		{
			case 1:System.out.println("sunday");
					break;
			case 2:System.out.println("monday");
					break;
			case 3:System.out.println("tuesday");
					break;
			case 4:System.out.println("wednsday");
					break;
			case 5:System.out.println("thursday");
					break;
			case 6:System.out.println("friday");
					break;
			case 7:System.out.println("saturday");
					break;
			default:break;
		}
		sc.close();
	}
}
