
import java.util.Scanner;

public class ArrayInputExample {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("How many numbers you want to add in the array? : ");
        int size = obj.nextInt();

        int[] myarr = new int[size];

        System.out.print("Enter " + size + " numbers: ");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number for index " + i + ": ");

            myarr[i] = obj.nextInt();

        }

        System.out.println("-------------------------");
        System.out.println("You entered the following numbers:");

        for ( int nums : myarr){
            System.out.print(nums + " ");

        }

        obj.close();

    }

}
