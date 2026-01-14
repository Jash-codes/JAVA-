public class Encapsulationdemo{
	public static void main(String[]args){
		
		BankAccount myacc1 = new BankAccount("ACCIT1062",50000,8015);
		
		myacc1.deposit(25000,8015);
		
		myacc1.withdraw(10000,8015);
		
		System.out.println("The new balance is : Rs." + myacc1.getbalance());
		
	}
}


class BankAccount{
	
	private String accountnumber;
	private double balance;
	private int pincode;
	
	public BankAccount(String accno, double bal, int pin_no){
		
		this.accountnumber = accno;
		this.balance = bal;
		this.pincode = pin_no;
	}
	
	public String getAccountnumber(){
		return accountnumber;
	}
	
	public double getbalance(){
		return balance;
	}
	
	public void deposit(double amount, int enteredPinno){
		if (enteredPinno == pincode){
			if (amount > 0){
				balance = balance + amount;
				System.out.println("The deposit amount is : Rs." + amount);
			}else{
				System.out.println("Error: Invalid deposit amount.");
			}
		}
	}
	
	public void withdraw(double amount, int enteredPinno){
		if (enteredPinno == pincode){
			if (balance >= amount){
				balance = balance - amount;
				System.out.println("Withdrawn: " + amount);
			}else{
				System.out.println("Error: Insufficient Balance!");
		    }
			
		}else{
			System.out.println("Error: Wrong PIN!");
			}
		}
	}
