import java.util.Scanner;
class Dowhile
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		System.out.println("enter n");
		int n=x.nextInt();
		if(n<=100)
		{
		do
		{
			System.out.println(n);
			n++;
			
		}while(n<=100);
		}
	}
}
