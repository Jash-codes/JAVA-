import java.util.*;

public class new1b{
	
	static int thirdlargest(int [] arr){
		
		int n = arr.length;
		
		int first = -1;
		for (int i = 0; i < n; i++){
			if(arr[i] > first){
				first = arr[i];
			}
		}
		
		int second = -1;
		for (int i = 0; i < n ; i++){
			if (arr[i] > second  && arr[i] < first){
				second = arr[i];
			}
		}
		
		int third = -1;
		for(int i = 0; i < n; i++){
			if (arr[i] > third && arr[i] < second){
				third = arr[i];
			}
		}
		
		return third;
	
	}
	
	public static void main(String[] args){
		
		int [] arr = {11,35,18,90,34};
		
		System.out.println("The Third largest is : " + thirdlargest(arr));
	}

}