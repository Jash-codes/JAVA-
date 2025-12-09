import java.io.IOException;
import java.util.Scanner;

public class Bitwiseor {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int num = scanner.nextInt();

        if ((num | 1) == num + 1) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }

        scanner.close();

    }
}
