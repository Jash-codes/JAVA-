import java.util.Scanner;

public class floatmultiply {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first float number: ");
        float f1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float f2 = scanner.nextFloat();

        float result = f1 * f2;
        System.out.println("----------------------------");
        
        System.out.println("the result is : " + result);
        System.out.println("----------------------------");

        scanner.close();

    }
}
