import java.util.Scanner;
class ifelse
{
public static void main(String[] args)
{
	Scanner x=new Scanner(System.in);
	System.out.println("enter num");
	int num=x.nextInt();
	if(num%2==0)
	{
		System.out.println(num+":is even");
	}
	else
	{
		System.out.println(num+":is odd");
 	}
	x.close();
}
}
