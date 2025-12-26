
import java.util.Arrays;

public class arrayinit {

     public static void main(String[] args) {
        
        int [] myarr = new int [6];

        //assigning values
        myarr[0] = 1;
        myarr[1] = 10 ;
        myarr[2] = 4 ;
        myarr[3] = 5 ;
        myarr[4] = 8 ;
        myarr[4] = 8 ;
        // only prints the number initialized in the array size
        myarr[4] = 8 ;

        System.out.println(Arrays.toString(myarr));
    }
    
}
