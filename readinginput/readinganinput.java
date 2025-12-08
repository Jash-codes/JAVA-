
import java.util.Scanner;

public class readinganinput{

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = sc.nextInt();

        System.out.println("the entered number is: " + num) ;
        
    }

}