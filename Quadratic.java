// write a java program for quadratic equation
import java.util.Scanner;
class Quadratic 
{
	public static void main(String[] args)
	{
		double D;
		Scanner sc=new Scanner(System.in);
		double b=sc.nextDouble();
		double a=sc.nextDouble();
		double c=sc.nextDouble();
		D=b*b-4*a*c;
		if(D>0)
		{
			System.out.println("roots are real and distrinct");
		}
		else if(D==0)
		{
			System.out.println("roots are real and equal");
		}
		else
		{
			System.out.println("roots are imaginary");
		}
	}
}
	
