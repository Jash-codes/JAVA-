import java.util.Scanner;

public class simpleint {

    static Integer simpleinterest (int P,int T,int R){

        int SI = P*T*R / 100;
        return SI;
    }
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the principle amount: ");
        int amount = obj.nextInt();

        System.out.print("Enter the time period(years): ");
        int time = obj.nextInt();

        System.out.print("Enter the rate of interest: ");
        int interest_rate = obj.nextInt();

        int Simple_Interest = simpleinterest(amount, time, interest_rate);

        int Total = amount + Simple_Interest;

        System.out.println("The interest rate for " + amount + " is " + Simple_Interest);
        System.out.println("The total amount is " + Total);

        obj.close();


    }
}
