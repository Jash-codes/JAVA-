import java.util.Scanner;

public class example2 {

    static Integer GCD(int a, int b) {  
        if (a == 0)             //loops untill a = 0
            return b;
        return GCD(b % a, a); 
    }

    static Integer LCM(int a, int b) {
        return (a / GCD(a, b)) * b;   //GCD(25, 15) = 5 
    }   // LCM = (25 / 5) * 15 = 5 * 15 = 75


    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = obj.nextInt();

        System.out.print("Enter the second number: ");
        int y = obj.nextInt();

        int result = LCM(x, y);

        System.out.println("The LCM of " + x + " and " + y + " is " + result);

        obj.close();
    }

}
