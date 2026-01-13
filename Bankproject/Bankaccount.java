
import java.util.Scanner;

public class Bankaccount {

    private String Accountnumber;
    private double Balance;
    private int Pinnumber;

    public Bankaccount(String accno,double initalamount,int pin){
        this.Accountnumber = accno;
        this.Balance = initalamount;
        this.Pinnumber = pin;
    }

    public void depositamount(String accountno,int pinno, double depositamount){
    if (this.Accountnumber.equals(accountno) && this.Pinnumber == pinno){
        if (depositamount > 0){
            this.Balance = depositamount + Balance;
            System.out.println("New balance is : " + Balance);

        }else{
            System.out.println("Entered wrong credentails");
        }
            
        }
    }
    


    public static void main(String[] args) {

        Scanner obj1 = new Scanner(System.in);

        System.out.println("Setup bank account" );
        

        
        

    }
}
