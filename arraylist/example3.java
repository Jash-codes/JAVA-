import java.util.*;

public class example3{
	
	public static void main(String[]args){
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		System.out.println(a);
		a.add(1, 10); // adding at specific index
		
		System.out.println(a);
		
		System.out.println(a.contains(2)); //returns boolean
		System.out.println(a.get(1));
		a.remove(0);
		System.out.println(a.size());
		
		System.out.println(a);
		
	}
}