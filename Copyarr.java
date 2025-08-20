//program for copying the array in diff ways 
import java.util.Arrays;
class Copyarr
{
	public static void main(String[] args)
	{
		int[] arr={5,6,3,2,8};
		//copyof
		int[] newarr=Arrays.copyOf(arr,4);
		//clonearray
		int[] clonearr=arr.clone();
		int[] array=new int[5];
		//system.arraycopy
		System.arraycopy(arr,1,array,0,4);
		System.out.println("given array  "+Arrays.toString(arr));
		System.out.println("system.arraycopy array  "+Arrays.toString(array));
		System.out.println("clone array  "+Arrays.toString(clonearr));
		System.out.println("copyOf array  "+Arrays.toString(newarr));
	}
}
