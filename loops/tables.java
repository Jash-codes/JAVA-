package loops;
import java.util.Scanner;

public class tables {

    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number: ");

        int num = scanner.nextInt();

        for(int i = 1;i <= 10;i++){
            int result = num * i;

        System.out.println(num + " x " + i + " = " + result);

        }

        scanner.close();
    
    }
    
}
