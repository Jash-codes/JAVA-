import java.io.IOException;
import java.util.Scanner;

public class evenorodd {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--------------------------------");
        System.out.println("ENTER BELOW TO CHECK EVEN OR ODD");

        System.out.print("Enter the number: ");

        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " is even..");
        } else {
            System.out.println(num + " is odd..");
        }
        
        scanner.close();
    }
    
}
