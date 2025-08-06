//java program for print array
import java.util.Scanner;
class Arrayprint
{
	public static void main(String[] args)
	{
		System.out.println("enter n");       
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
		System.out.println("enter number of elements");                
		int[] a=new int[n];                                                              
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
		} 
		System.out.println("reverse string is");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
