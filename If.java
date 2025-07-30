import java.util.Scanner;
class If
{
public static void main(String[] args)
{
	Scanner x=new Scanner(System.in);
	System.out.println("enter age");
	int age=x.nextInt();
	if(age==18)
	{
		System.out.println(age+"eligible to vote");
	}
}
}
