import java.util.Scanner;
class ifelse
{
public static void main(String[] args)
{
	Scanner x=new Scanner(System.in);
	System.out.println("enter marks");
	int marks=x.nextInt();
	if(marks<35)
	{
		System.out.println("Fail");
	}
	else if(marks>35 && marks<=50)
	{
		System.out.println("Grade C");
 	}
 	else if(marks>50 && marks<=75)
 	{
 		System.out.println("Grade B");
 	}
 	else if(marks>75 && marks<=100 )
	{
		System.out.println("Grade A");
	}
	x.close();
}
}
