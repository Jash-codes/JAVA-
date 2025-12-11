import java.util.Scanner;

public class compint {

    static Double compoundinterest (int P, double r, int t){

        double CIamount = P * Math.pow((1 + r / 100),t);
        return CIamount;

    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the Principle amount: ");
        int amount = obj.nextInt();

        System.out.print("Enter the rate of interest: ");
        double interest = obj.nextDouble();

        System.out.print("Enter the time period (years: ");
        int years = obj.nextInt();

        double Compound_Interest = compoundinterest(amount, interest, years);

        System.out.printf("The compound interest is : %.2f ", Compound_Interest);


        obj.close();

    }
    
}
