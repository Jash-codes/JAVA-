import java.util.Scanner;

public class nameage{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your name: ");

        String name = scanner.nextLine();

        System.out.print("enter your age: ");

        int age = scanner.nextInt();

        System.out.println("------------------------------------");
        System.out.println("Your name is : " + name);
        System.out.println("Your age is : " + age);
        System.out.println("------------------------------------");
    
        scanner.close();
    }
}