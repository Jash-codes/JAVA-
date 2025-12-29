import java.util.Scanner;

public class ternaryoperator {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);


        System.out.print("Enter your age: ");
        int age = obj.nextInt();

        String validage = (age >= 18) ? "eligible" : "not eligible";
        System.out.println(validage);

        obj.close();
    }

}
