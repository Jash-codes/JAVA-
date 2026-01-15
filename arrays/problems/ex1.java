import java.util.*;

public class ex1{
	
	static int Secondlargest(int [] arr){
		
		int n = arr.length;
		
		Arrays.sort(arr);
		
		for (int i = n - 2; i >= 0; i--){
			
			if(arr[i] != arr[n - 1]){
				return arr[i];
			}
		} return -1;
		
		
			
		}
		
	public static void main (String[]args){
		
		int [] arr = {21,6,33,78,10};
		System.out.println("the second largest is : " + Secondlargest(arr));		
	}
}