import java.util.Scanner;

public class mathpattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of queries: ");
        int t = scanner.nextInt();

        for(int i = 0; i < t;i++){

            int a = scanner.nextInt();
            int b=scanner.nextInt();
            int n=scanner.nextInt();

            int sum = a;

            int poweroftwo = 1;

            for(int j = 0;j < n;j++){

                sum = sum + (poweroftwo * b);

                System.out.print(sum + " " );

                poweroftwo = poweroftwo * 2;
            }

            System.out.println("");

            scanner.close();
        }

        

    }
    
}
