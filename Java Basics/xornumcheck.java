import java.io.IOException;
import java.util.Scanner;

public class xornumcheck {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------");
        System.out.print("Enter a number : ");

        int num = scanner.nextInt();

        if ((num ^ 1) == num + 1) {

            System.out.println(num + " is even");
        } else {

            System.out.println(num + " is odd");
        }

    }

}


//   Number = 5              0  1  0  1    - Representation of  5 in Binary Format
//              Bitwise XOR  0  0  0  1    - Representation of  1 in Binary Format
                       
//                             0  1  0  0    - Representation of  4 in Binary Format
//     Result- Number was odd so bitwise And by 1 decrement the value
// -----------------------------------------------------------------------------------------------
// Number = 8            1  0  0  0    - Representation of  8 in Binary Format
//          Bitwise XOR  0  0  0  1    - Representation of  1 in Binary Format

//                           1  0  0  1    - Representation of  9 in Binary Format
//     Result- Number was even so bitwise And by 1 increment the value