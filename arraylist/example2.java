
import java.util.ArrayDeque;

public class example2 {

    public static void main(String[] args) {
        
        ArrayDeque<Integer> nums = new ArrayDeque<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);

        // nums.addFirst(111);
        // nums.addLast(999);
        nums.pop();
        
        System.out.println(nums);
        // System.out.println(nums.peek());
        // System.out.println(nums.peekFirst());
        // System.out.println(nums.peekLast());
        
    }
    
}
