
import java.util.Scanner;

public class example1 {

    static void prime(int N){

        int x, y, flg;

        System.out.println("All the prime numbers between 0 and " + N + " are: ");

        for (x = 0 ; x <=N ;x++){

            if(x == 0 || x == 1)
                continue;

            flg = 1;

            for(y = 2; y <= 2; ++y){
                if (x % y == 0){
                    flg = 0;
                    break;
                }
            }

            if (flg == 1)
                System.out.print(x + " ");

        }
    }

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the Number(N) : ");

        int num = obj.nextInt();

        prime(num);

        obj.close();
        
    }
    
}
