public class example4 {

    static int Even_array (int[] arr){

        int count = 0;
        for(int x : arr ){
            if ( x % 2 == 0){
                count++;
            }
        
        }

        return count;
    }

    public static void main(String[] args) {

        int [] myarr = {1,6,2,9,8,5};

        int even_elements = Even_array(myarr);

        System.out.println("the even elements are: " + even_elements);
        
    }
    
}
