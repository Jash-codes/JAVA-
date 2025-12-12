public class example2 {

    static int findlargest( int [] arr){

        int max = arr[0];
        for(int x : arr){
            if(x > max) 
                max = x;
        }
        return max;
    }

    public static void main(String[] args) {
        
        int [] my_array = {8,4,2,9,1};

        int largest = findlargest(my_array);

        System.out.println("The largest element in the array is: " + largest);
    }
}
