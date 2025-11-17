public class localvariable {

    public void calculatesum(){

        int num1 = 12; // variable inside a method is called local variable  
        int num2 = 34;

        int sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }

    public static void main(String[] args) {
        localvariable print = new localvariable(); // can only be accessed in main method

        print.calculatesum();
    }
}
