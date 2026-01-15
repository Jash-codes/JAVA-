import java.util.*;

public class new1a{
	
	static int secondlargest(int [] arr){
		
		int n = arr.length;
		
		int Largest = -1, secondLargest = -1;  //staright away assigning values
		
		for (int i = 0; i < n; i++){
			if (arr[i] > Largest){
				Largest = arr[i];
			}
		}
		
		for (int i = 0; i < n; i++){
			if(arr[i] > secondLargest && arr[i] != Largest){
				secondLargest = arr[i];
			}
		}
		
		return secondLargest;
	}
	
	public static void main(String[]args){
		
		int [] arr = {11,35,18,90,34};
		
		System.out.println("the second largest is : " + secondlargest(arr));
	}
}