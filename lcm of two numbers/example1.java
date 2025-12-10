import java.util.Scanner;

public class example1 {

    static Integer findlcm(int a, int b) {

        int ans = (a > b) ? a : b; //ternary operator also here it takes the greater number and assigns it to ans variable

        while (true) {
            if (ans % a == 0 && ans % b == 0) // loops untill both numbers divide the largest number (25) here
                return ans;
            ans++;

        }

    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = obj.nextInt();

        System.out.print("Enter second number: ");
        int y = obj.nextInt();

        int result = findlcm(x, y);

        System.out.println("The LCM of " + x + " and " + y + " is " + result);

        obj.close();

    }

}
