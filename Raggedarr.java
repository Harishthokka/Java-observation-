//program for ragged array  
import java.util.Scanner;
import java.util.Arrays;
class Raggedarr
{
	public static void main(String[] args)
	{
		int[][] raggedarr=new int[3][];
		raggedarr[0]=new int[4];
		raggedarr[1]=new int[2];
		raggedarr[2]=new int[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<raggedarr.length;i++)
		{
		        for(int j=0;j<raggedarr[i].length;j++)
		        {
		                System.out.println("enter ele["+i+"]["+j+"]");
		                raggedarr[i][j]=sc.nextInt();
		        }
		}
		System.out.println("ragged array is"+Arrays.deepToString(raggedarr));
	}
}
