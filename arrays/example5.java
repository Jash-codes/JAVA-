public class example5{

    static int secondlargest(int [] arr){

        int largest = Integer.MIN_VALUE;

        int second_largest = Integer.MIN_VALUE;

        for (int x : arr){
            if ( x > largest){
                second_largest = largest;
                largest = x;
            } else if(x > second_largest && x != largest) {

                second_largest = x;
                
            }
        }
    return second_largest;
    }

    public static void main(String[] args) {
        
        int [] myarr = {10,20,40,50};

        System.out.println("The second largest is : " + secondlargest(myarr));
    }
}