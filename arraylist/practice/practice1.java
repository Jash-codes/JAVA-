import java.util.*;

public class practice1{
	public static void main(String[]args){
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		System.out.println("orginal array : " + arr);
		
		System.out.println("Printing Alternatives");
		
		ArrayList<Integer> alt = new ArrayList<Integer>();

		for (int i = 0; i < arr.size(); i = i + 2){
			alt.add(arr.get(i));
		}
		
		System.out.println("alt array : " + alt);
	}
}