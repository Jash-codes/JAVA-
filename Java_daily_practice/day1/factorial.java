
import java.util.Scanner;


public class factorial {

    public static int facotrialfinder(int n) {

        int result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = obj.nextInt();

        if (num <= 1){
            System.out.println("pls enter number greater than 1");
        }else{
            System.out.println("The factoral is : " + facotrialfinder(num));
        }

        obj.close();
    }

}
