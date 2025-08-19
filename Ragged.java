//program for array operations 
import java.util.Scanner;
import java.util.Arrays;
class Ragged
{
	public static void main(String[] args)
	{
		int[][] raggedarr=new int[4][];
		raggedarr[0]=new int[4];
		raggedarr[1]=new int[2];
		raggedarr[2]=new int[3];
		raggedarr[3]=new int[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<raggedarr.length;i++)
		{
		        for(int j=0;j<raggedarr.length;j++)
		        {
		                System.out.println("enter ele["+i+"]["]);
		                raggedarr[i][j]=sc.nextInt();
		        }
		}
		System.out.println("ragged array "+Arrays.toString(raggedarr));
	}
}
