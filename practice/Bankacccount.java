import java.util.Scanner;

public class Bankacccount {

    private String accountnumber;

    public String getaccountnumber() {
        return accountnumber;
    }

    private double balance;

    public double getbalance() {
        return balance;
    }

    private int pincode;

    public Bankacccount(String accno, double initialbalance, int pin) {

        this.accountnumber = accno;
        this.balance = initialbalance;
        this.pincode = pin;

    }

    public void deposit(double amount) {
        if (amount > 0){
            this.balance = balance + amount;
            System.out.println("Your New Balance is : " + this.balance);
        } else {
            System.out.println("Enter correct amount");
        }

    }

    public static void main(String[] args) {
        
        Bankacccount new1 = new Bankacccount("ABCD1007", 60000.00, 87654321);

        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter the money to deposit : ");
        double depositmoney = obj1.nextDouble();

        new1.deposit(depositmoney);
    }

}
