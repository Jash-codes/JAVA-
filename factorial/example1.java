import java.util.Scanner;

public class example1 {

    static Integer factcheck(int n) {

        int res = 1, i;

        for (i = 2; i <= n; i++) {
            res *= i;

        }
        return res;
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int result = obj.nextInt();

        int Factorial = factcheck(result);

        System.out.println("The Factorial of " + result + " is " + Factorial);

        obj.close();
    }

}
