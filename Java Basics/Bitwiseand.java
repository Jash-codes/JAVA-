import java.io.IOException;
import java.util.Scanner;

public class Bitwiseand {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------");
        System.out.print("Enter a number : ");

        int num = scanner.nextInt();

        if ((num & 1 )== 1) {

            System.out.println(num + " is odd");
        } else {

            System.out.println(num + " is even");
        }

    scanner.close();
}

}



//   Number = 5              0  1  0  1    - Representation of  5 in Binary Format
//   Bitwise AND             0  0  0  1    - Representation of  1 in Binary Format
   
//                           0  0  0  1    - Representation of  1 in Binary Format
//     Result- Number was odd so bitwise And by 1 is 1
//------------------------------------------------------------------------------------------
// Number = 8            1  0  0  0    - Representation of  8 in Binary Format
// Bitwise AND           0  0  0  1    - Representation of  1 in Binary Format
                       
//                       0  0  0  0    - Representation of  0 in Binary Format
//     Result- Number was even so bitwise And by 1 is 0