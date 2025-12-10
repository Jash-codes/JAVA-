import java.util.Scanner;

class example1{

    static Integer GCD(int x, int y){

        if (y == 0)
            return x;
        return GCD(y, x % y);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = obj.nextInt();

        System.out.print("Enter second number: ");
        int b = obj.nextInt();

        int result = GCD(a, b);

        System.out.println("The GCD of " + a + " & " + b + " is " + result);

        obj.close();
    }
}