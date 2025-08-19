//program for array operations 
import java.util.Arrays;
class Arrayoperations
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
		//tostring
		System.out.println("given array  "+Arrays.toString(arr));
		System.out.println("system.arraycopy array  "+Arrays.toString(array));
		System.out.println("clone array  "+Arrays.toString(clonearr));
		System.out.println("copyOf array  "+Arrays.toString(newarr));
		//sorting the array
		Arrays.sort(arr);
		System.out.println("sorted array  "+Arrays.toString(arr));
		//binary search
		System.out.println("binary search"+Arrays.binarySearch(arr,2));
		//fill
		Arrays.fill(arr,7);
		System.out.println("fill array  "+Arrays.toString(arr));
	}
}
