import java.util.*;

public class ex8 {

    public static void main(String[] args) {
        
        int [] arr = {4,5,9,6,3,1,7};
        Integer [] arr1 = {2,6,1,9,8};

        Arrays.sort(arr);
        
        System.out.println(Arrays.toString(arr)); 
        
        System.out.println(arr); 
        
        for (int num : arr){
            System.out.print(num + " ");
        }

        System.out.println();
        
        Arrays.sort(arr1, 0, 3);
        System.out.println(Arrays.toString(arr1)); 

        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1)); 

    }
    
}
